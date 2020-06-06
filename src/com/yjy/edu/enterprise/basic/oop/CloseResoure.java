package com.yjy.edu.enterprise.basic.oop;

public class CloseResoure implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("close");
	}

	public void func() {
		System.out.println("call func");
	}

	public static void explicitClose() throws Exception {
		CloseResoure obj = new CloseResoure();
		try {
			obj.func();
			throw new IllegalStateException();
		} finally {
			obj.close();
		}
	}

	public static void main(String[] args) throws Exception {
		try (CloseResoure obj = new CloseResoure()) {
			obj.func();
		}
		System.out.println("done");
		explicitClose();
	}
}
