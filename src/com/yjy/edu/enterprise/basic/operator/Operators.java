package com.yjy.edu.enterprise.basic.operator;

import java.util.Objects;

public class Operators {

	public static void shiftOperations() {
		// 13二进制位1101，77的二进制位111
		System.out.println(13 & 7);
		System.out.println(13 | 7);
		System.out.println(~13);
		System.out.println(13 ^ 7);
		System.out.println(-13 >> 2);
		System.out.println(-13 >>> 2);
		System.out.println(13 << 2);
	}

	public static void logicalOperators() {
		System.out.println(true && true);
		System.out.println(5 < 3 || 8 > 7);
		System.out.println(5 < 3 || 8 < 6);
		System.out.println(!true);
		System.out.println(true ^ false);
	}

	public static void compareOperators() {
		System.out.println(true && true);
		System.out.println(5 < 3 || 8 > 7);
		System.out.println(5 < 3 || 8 < 6);
		System.out.println(!true);
		System.out.println(true ^ false);
	}

	public static void main(String[] args) {
		if (args == null) {
			return;
		}
		if (Objects.equals(args[0], "-s")) {
			shiftOperations();
		} else if (Objects.equals(args[0], "-l")) {
			logicalOperators();
		}
	}
}
