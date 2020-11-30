package com.yjy.edu.enterprise.advanced.reference;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class WReference {

	public static void main(String[] args) {
		weakReference();
	}

	public static void weakReference() {
		List<WeakReference<int[]>> list = new ArrayList<>();
		out: while (true) {
			WeakReference<int[]> reference = new WeakReference<>(new int[1024 * 1024]);
			list.add(reference);
			System.gc();
			if (list.get(0).get() == null) {
				System.out.println("int[] in index 0 is reclaimed by GC");
				break out;
			}
			System.out.println("add int[] to index " + list.size());
		}
	}

}
