package com.yjy.edu.enterprise.basic.oop;

public class InheritInnerClass {

	public static class StaticInnerClass {

		public StaticInnerClass() {
			System.out.println("In StaticInnerClass constructor");
		}
	}

	public class NonStaticInnerClass {

		public NonStaticInnerClass() {
			System.out.println("In NonStaticInnerClass constructor");
		}
	}

	public static class StaticInnerClassImpl extends StaticInnerClass {

		public StaticInnerClassImpl() {
			System.out.println("In StaticInnerClassImpl constructor");
		}
	}

	public class NonStaticInnerClassImpl extends InheritInnerClass.NonStaticInnerClass {
		public NonStaticInnerClassImpl() {
			System.out.println("In NonStaticInnerClassImpl constructor");
		}
	}

	public static void main(String[] args) {
		new StaticInnerClassImpl();
		new InheritInnerClass().new NonStaticInnerClassImpl();
	}
}
