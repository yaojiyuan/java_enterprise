package com.yjy.edu.enterprise.basic.oop;

public class MethodCallInJVM {

	public MethodCallInJVM() {
		System.out.println("in MethodCallInJVM method");
	}

	public static void staticMethod() {
		System.out.println("in staticMethod method");
	}

	public void memberMethod() {
		System.out.println("in memberMethod method");
	}

	public static interface MethodCall {
		void memberMethod();
	}

	public static class MethodCallInJVMSub extends MethodCallInJVM implements MethodCall {

		public void memberMethod() {
			System.out.println("in MethodCallInJVMSub memberMethod method");
		}
	}

	public static void main(String[] args) {
		MethodCallInJVM.staticMethod();
		MethodCallInJVM methodCallInJVM = new MethodCallInJVMSub();
		methodCallInJVM.memberMethod();
		MethodCall methodCall = (MethodCall) methodCallInJVM;
		methodCall.memberMethod();
	}
}
