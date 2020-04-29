package com.yjy.edu.enterprise.basic.type;

public class DecimalOperators {

	public static void main(String[] args) {
		System.out.println("(23.5f + 15.6f):" + (23.5f + 15.6f));
		System.out.println("(1.3434f + 2.55000001f):" + (1.3434f + 2.55000001f));
		System.out.println("(1.1f * 5f):" + (1.1f * 5f));
		System.out.println("(1.100012f * 5.33f):" + (1.100001f * 5.33f));
		System.out.println("(1e308*10):" + 1e308 * 10);
		System.out.println("(67.45/0f):" + (67.45 / 0f));
		System.out.println("(0f/0f):" + (0f / 0f));
		System.out.println("(1.3400000001f == 1.34f):" + (1.34f == 1.34f));
		System.out.println("(NAN == NAN):" + (Float.NaN == Float.NaN));
		System.out.println("((int)456.78):" + ((int) 456.78));
		System.out.println("((int)-456.78):" + ((int) -456.78));
		System.out.println("(1.2f%0.6f):" + (1.2f%0.6f));
		System.out.println("(1.3f%0.6f):" + (1.3f%0.6f));
		System.out.println("(-1.3f%0.6f):" + (-1.3f%0.6f));
	}
}
