package com.yjy.edu.enterprise.basic.oop;

public class AnonymousClass {

	public interface One {
		void speak();
	}

	public abstract static class Two {
		private int value;

		public Two(int value) {
			this.value = value;
		}

		public abstract void speak();

		public int getValue() {
			return value;
		}
	}

	public static void main(String[] args) throws Exception {
		One a = new One() {

			@Override
			public void speak() {
				System.out.println("hello");
			}

		};
		Two b = new Two(3) {

			public void speak() {
				System.out.println("word");
			}

		};
		a.speak();
		b.speak();
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
	}
}
