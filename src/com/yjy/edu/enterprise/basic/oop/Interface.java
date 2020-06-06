package com.yjy.edu.enterprise.basic.oop;

public class Interface {

	public interface InfA {
		void say();

		static void staticMethod() {
		}

		default void print() {
			System.out.println("my name is InfA");
		}
	}

	public interface InfB {
		void speak();
	}

	public static class ClassAB implements InfA, InfB {

		@Override
		public void speak() {
			System.out.println("speak");
		}

		@Override
		public void say() {
			System.out.println("say");
		}
	}

	public static void main(String[] args) {
		InfA a = new ClassAB();
		InfB b = (InfB) a;
		a.say();
		b.speak();
	}

}
