package com.yjy.edu.enterprise.basic.fc;

public class WhileFc {

	public static void main(String[] args) {
		printNumbers(10);
		System.out.println();
		printNumbersV2(10);
		System.out.println();
		printNumbersV3(10);
		System.out.println();
		indexOf("abcdaega", 'a');
		System.out.println();
		firstIndexOf("abcdaega", 'a');
	}

	public static void printNumbers(int max) {
		int i = 0;
		while (i < max) {
			System.out.print(i);
			if (i != max - 1) {
				System.out.print(",");
			}
			i++;
		}
	}

	public static void printNumbersV2(int max) {
		int i = 0;
		while (true) {
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

	public static void printNumbersV3(int max) {
		int i = 0;
		do {
			System.out.print(i);
			if (i != max - 1) {
				System.out.print(",");
			}
			i++;
		} while (i < max);
	}

	public static void indexOf(String s, char c) {
		int length = s.length();
		int i = 0;
		while (i < length) {
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
		int i = 0;
		while (i < length) {
			if (s.charAt(i) != c) {
				continue;
			}
			System.out.print(i);
			break;
		}
	}

}
