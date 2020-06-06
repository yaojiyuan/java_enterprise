package com.yjy.edu.enterprise.basic.oop;

public class ConstructorOrder {

	public static abstract class A {

		static {
			System.out.println("in A static block");
		}

		public A() {
			System.out.println("in A constructor");
		}
	}

	public static abstract class AA extends A {

		static {
			System.out.println("in AA static block");
		}

		public AA() {
			System.out.println("in AA constructor");
		}
	}

	public static class AAA extends AA {

		static {
			System.out.println("in AAa static block");
		}

		public AAA() {
			System.out.println("in AAa constructor");
		}
	}
	
	public static void main(String[] args) {
		new AAA();
	}
}
