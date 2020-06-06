package com.yjy.edu.enterprise.basic.array;

import java.lang.reflect.Array;

public class Arrays {

	public static void main(String[] args) {
		int[] a = null; // 申明了整型数组变量a
		float[] b = new float[3]; // 定义了整型数组变量b
		int c[] = new int[3]; // 定义了整型数组变量c
		int[] d = { 1, 2, 3 }; // 定义和初始化了整型数组变量d
		a = c;
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}

		printArray(a);
		System.out.println();
		printArray(b);
		System.out.println();
		printArray(c);
		System.out.println();
		printArray(d);
	}

	private static void printArray(Object obj) {
		for (int i = 0; i < Array.getLength(obj); i++) {
			System.out.print(Array.get(obj, i));
			if (i != Array.getLength(obj) - 1) {
				System.out.print(",");
			}
		}
	}

}
