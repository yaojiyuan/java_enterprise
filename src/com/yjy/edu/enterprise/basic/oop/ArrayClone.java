package com.yjy.edu.enterprise.basic.oop;

public class ArrayClone {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3 };
		int[] clone = a.clone();
		for (int i = 0; i < clone.length; i++) {
			clone[i] = clone[i] * clone[i];
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		for (int i = 0; i < clone.length; i++) {
			System.out.print(clone[i]);
		}
	}
	
	
}
