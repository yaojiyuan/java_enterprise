package com.yjy.edu.enterprise.advanced.reference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class SReference {

	public static void main(String[] args) {
		softReference();
		softReferenceV2();
	}

	public static void softReference() {
		List<SoftReference<int[]>> list = new ArrayList<>();
		out: while (true) {
			SoftReference<int[]> reference = new SoftReference<>(new int[1024 * 1024]);
			list.add(reference);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).get() == null) {
					System.out.println("int[] in index " + i + " is reclaimed by GC");
					break out;
				}
			}
			System.out.println("add int[] to index " + list.size());
		}
	}

	public static void softReferenceV2() {
		List<SoftReference<int[]>> list = new ArrayList<>();
		ReferenceQueue<int[]> queue = new ReferenceQueue<>();
		out: while (true) {
			SoftReference<int[]> reference = new SoftReference<>(new int[1024 * 1024], queue);
			list.add(reference);
			Reference<? extends int[]> r = queue.poll();
			if (r != null) {
				System.out.println("a int[] is reclaimed ");
				break out;
			}
			System.out.println("add int[] to index " + list.size());
		}
	}
}
