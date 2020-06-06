package com.yjy.edu.enterprise.basic.oop;

public class InnerClass {

	private int innerValue = 5;

	public InnerClass() {
		System.out.println("Init InnerClass");
	}

	public class One {

		public One() {
			System.out.println("Init One");
			System.out.println("inner value in Inner Class is " + InnerClass.this.innerValue);
			System.out.println(this.getClass().getName());
		}
	}

	public static class Two {
		public Two() {
			System.out.println("Init Two");
			System.out.println(this.getClass().getName());
		}
	}

	public static void main(String[] args) throws ClassNotFoundException {
		InnerClass innerClass = new InnerClass();
		innerClass.new One();
		new Two();
	}
}
