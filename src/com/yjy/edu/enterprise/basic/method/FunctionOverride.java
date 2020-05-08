package com.yjy.edu.enterprise.basic.method;

public class FunctionOverride {

	public void print(String a) {
		System.out.println(a);
	}

	public void print(String a, String b) {
		System.out.println(a + b);
	}

	public void print(String a, String b, String c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		FunctionOverride functionOverride = new FunctionOverride();
		functionOverride.print("hello");
		functionOverride.print("hello", " China");
		functionOverride.print("hello", "China", "Greate");
	}

}
