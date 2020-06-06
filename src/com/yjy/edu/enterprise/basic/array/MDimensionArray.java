package com.yjy.edu.enterprise.basic.array;

import java.lang.reflect.Array;

public class MDimensionArray {

	public static void main(String[] args) {
		TwoDArray();
		ThreeDArray();
	}

	private static void printArray(Object obj) {
		for (int i = 0; i < Array.getLength(obj); i++) {
			System.out.print(Array.get(obj, i));
			if (i != Array.getLength(obj) - 1) {
				System.out.print(",");
			}
		}
	}

	private static void TwoDArray() {
		int[][] a = new int[3][];
		a[0] = new int[5];
		a[1] = new int[4];
		a[2] = new int[6];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = j + 1;
			}
		}
		for (int i = 0; i < a.length; i++) {
			printArray(a[i]);
			System.out.println();
		}
	}

	private static void ThreeDArray() {
		int[][][] a = new int[3][][];
		a[0] = new int[3][];
		a[1] = new int[4][];
		a[2] = new int[5][];
		a[0][0] = new int[1];
		a[0][1] = new int[2];
		a[0][2] = new int[3];
		a[1][0] = new int[1];
		a[1][1] = new int[2];
		a[1][2] = new int[3];
		a[1][3] = new int[4];
		a[2][0] = new int[1];
		a[2][1] = new int[2];
		a[2][2] = new int[3];
		a[2][3] = new int[4];
		a[2][4] = new int[5];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					a[i][j][k] = k + 1;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("{");
				printArray(a[i][j]);
				System.out.print("}");
			}
			System.out.println();
		}
	}

}
