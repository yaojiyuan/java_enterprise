package com.yjy.edu.enterprise.basic.oop;

public class StringComparation {

	public static void main(String[] args) {
		String a = "abc";
		String b = new String("abc");
		String c = "abc".intern();
		String d = new String("ab") + "c";
		System.out.println(a == "abc");
		System.out.println(b == "abc");
		System.out.println(c == "abc");
		System.out.println(d == "abc");
		System.out.println(Integer.valueOf(3) == 3); 

	}
}
