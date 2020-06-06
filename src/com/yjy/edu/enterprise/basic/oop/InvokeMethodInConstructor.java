package com.yjy.edu.enterprise.basic.oop;

public class InvokeMethodInConstructor {

	public static class BaseClass {

		BaseClass() {
			this.say();
		}

		protected void say() {
			System.out.println("In AbstractA");
		}
	}

	public static class ClassA extends BaseClass {

		private Integer a;

		ClassA() {
			a = 10;
		}

		@Override
		protected void say() {
			System.out.println("a init value is " + a);
		}
	}

	public static void main(String[] args) {
		new ClassA();
	}
}
