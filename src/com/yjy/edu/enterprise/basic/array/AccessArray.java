package com.yjy.edu.enterprise.basic.array;

import java.lang.reflect.Array;

public class AccessArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		printArray(a);
		System.out.println();
		printArrayV2(a);
		System.out.println();
		illegalAccess();
	}

	private static void printArray(int[] a) {
		System.out.print("[");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

	private static void printArrayV2(int[] a) {
		System.out.print("[");
		for (int i = 0; i < Array.getLength(a); i++) {
			System.out.print(Array.get(a, i));
			if (i != Array.getLength(a) - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

	private static void illegalAccess() {
		int[] a = null;
		try {
			System.out.println(a[0]);
		} catch (NullPointerException e) {
			System.out.println("a空指针异常");
		}
		a = new int[] { 1, 2, 3 };
		System.out.println(a[0]);
		System.out.println(a[2]);
		try {
			System.out.println(a[-14]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("数组越界异常");
		}
	}
}
