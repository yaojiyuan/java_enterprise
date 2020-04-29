package com.yjy.edu.enterprise.basic.type;

public class IntegerOperators {

	public static void main(String[] args) {
		System.out.println("(5>3):" + (5 > 3));
		System.out.println("(3>8):" + (3 < 8));
		System.out.println("(130 == 150):" + (130 == 150));
		System.out.println("(27 == 27):" + (27 == 27));
		System.out.println("(27l == 27):" + (27l == 27));
		System.out.println("(2 << 2):" + (2 << 2));
		System.out.println("(256 >> 2 ):" + (256 >> 2));
		System.out.println("(256 >>> 2 ):" + (256 >>> 2));
		System.out.println("(-256 >> 2 ):" + (-256 >> 2));
		System.out.println("(-256 >>> 2 ):" + (-256 >>> 2));
		System.out.println("(2 & 4 ):" + (2 & 4));
		System.out.println("(2 | 4 ):" + (2 | 4));
		System.out.println("(~8):" + (~8));
		System.out.println("(2+8):" + (2+8));
		System.out.println("(2-8):" + (2-8));
		System.out.println("(2*8):" + (2*8));
		System.out.println("(2/8):" + (2/8));
		System.out.println("(2%8):" + (2%8));
		System.out.println("(-2%8):" + (-2%8));
		System.out.println("(12%-8):" + (12%-8));
		System.out.println("(-12%-8):" + (-12%-8));
	}
}
