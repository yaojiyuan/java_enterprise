package com.yjy.edu.enterprise.basic.fc;

public class Assert {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.getClass().getName());
		AssertClass assertClass = new AssertClass();
		assertClass.testAssert();
		testAssert();
		a.testAssert();
	}

	public static void testAssert() {
		boolean enabled = false;
		assert enabled = true;
		System.out.println("Asserts " + (enabled ? "enabled" : "disabled"));
	} 

	public static class A {

		public void testAssert() {
			boolean enabled = false;
			assert enabled = true;
			System.out.println("Asserts " + (enabled ? "enabled" : "disabled"));
		} 
	}
	 
}
