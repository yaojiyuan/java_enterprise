package com.yjy.edu.enterprise.basic.oop;

public class PrimitiveBoxComparation {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Integer a = 100;
		Integer b = 100;
		System.out.println(a == b);
		System.out.println(a == 100);
		Integer c = Integer.valueOf(100);
		Integer d = Integer.valueOf(100);
		System.out.println(c == d);
		System.out.println(c == 100);
		Integer e = new Integer(100);
		Integer f = new Integer(100);
		System.out.println(e == 100);
		System.out.println(e == f);
		System.out.println(Long.valueOf(100) == 100l);
	}
}
