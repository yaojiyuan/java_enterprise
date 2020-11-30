package com.yjy.edu.enterprise.advanced.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

public class PTReference {

	public static class MyObject {

		private int fd; //代表本地资源

		NativeResourceFinalizer finalizer;

		public MyObject(int fd) {
			this.fd = fd;
			NativeResourceFinalizer.register(this, new NativeResource(fd));
		}

		public void func() {
			System.out.println("use fd " + fd);
		}
	}

	public static class NativeResource {

		private int fd;

		public NativeResource(int fd) {
			this.fd = fd;
		}

		public void close() {
			System.out.println("close fd " + fd);
		}

	}

	public static class NativeResourceFinalizer extends PhantomReference<MyObject> {

		public static ReferenceQueue<MyObject> referenceQueue = new ReferenceQueue<>();

		private NativeResource nativeResource;

		private static Set<NativeResourceFinalizer> finalizers = new HashSet<>();

		public static NativeResourceFinalizer register(MyObject reference, NativeResource resource) {
			NativeResourceFinalizer finalizer = new NativeResourceFinalizer(reference, resource);
			return finalizer;
		}

		public NativeResourceFinalizer(MyObject reference, NativeResource resource) {
			super(reference, referenceQueue);
			this.nativeResource = resource;
			finalizers.add(this);
		}

		@Override
		public void clear() {
			finalizers.remove(this);
			nativeResource.close();
		}
		
		public static void remove(NativeResourceFinalizer finalizer) {
			finalizers.remove(finalizer);
		}

	}

	public static void main(String[] args) throws InterruptedException {
		new MyObject(1);
		System.gc();
		Reference<? extends MyObject> ref = NativeResourceFinalizer.referenceQueue.remove();
		ref.clear();
	}
}
