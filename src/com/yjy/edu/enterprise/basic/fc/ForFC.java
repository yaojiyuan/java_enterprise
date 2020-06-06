package com.yjy.edu.enterprise.basic.fc;

import java.util.Arrays;
import java.util.List;

public class ForFC {

	public static void main(String[] args) {
		printNumbers(10);
		System.out.println();
		printNumbersV2(10);
		System.out.println();
		Integer[] ints = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		printNumbersV3(ints);
		System.out.println();
		printNumbersV4(Arrays.asList(ints));
		System.out.println();
		indexOf("abcdaega", 'a');
		System.out.println();
		firstIndexOf("abcdaega", 'a');
	}

	public static void printNumbers(int max) {
		for (int i = 0; i < max; i++) {
			System.out.print(i);
			if (i != max - 1) {
				System.out.print(",");
			}
		}
	}

	public static void printNumbersV2(int max) {
		int i = 0;
		for (;;) {
			System.out.print(i);
			if (i != max - 1) {
				System.out.print(",");
			}
			i++;
			if (i == max) {
				break;
			}
		}
	}

	public static void printNumbersV3(Integer[] ints) {
		int index = 0;
		for (int i : ints) {
			System.out.print(i);
			index++;
			if (index != ints.length) {
				System.out.print(",");
			}
		}
	}

	public static void printNumbersV4(List<Integer> ints) {
		int index = 0;
		for (int i : ints) {
			System.out.print(i);
			index++;
			if (index != ints.size()) {
				System.out.print(",");
			}
		}
	}

	public static void indexOf(String s, char c) {
		int length = s.length();
		for (int i = 0; i < length; i++) {
			if (s.charAt(i) != c) {
				continue;
			}
			if (i != length - 1) {
				System.out.print(i + ",");
			} else {
				System.out.print(i);
			}
		}
	}

	public static void firstIndexOf(String s, char c) {
		int length = s.length();
		for (int i = 0; i < length; i++) {
			if (s.charAt(i) != c) {
				continue;
			}
			System.out.print(i);
			break;
		}
	}
}
