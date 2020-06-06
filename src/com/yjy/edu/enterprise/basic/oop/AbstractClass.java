package com.yjy.edu.enterprise.basic.oop;

public class AbstractClass {

	public static abstract class AbstractA {

		public abstract void speak();

		public abstract void say();
	}

	public static class AImpl extends AbstractA {

		@Override
		public void speak() {
			System.out.println("hello");
		}

		@Override
		public void say() {
			System.out.println("world");
		}

	}

	public static void main(String[] args) {
		AbstractA a = new AImpl();
		a.speak();
		a.say();
	}
}
