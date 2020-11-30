package com.yjy.edu.enterprise.advanced.classloader;

public class ExtClassLoader {

	public static void main(String[] args) {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader().getParent();
		System.out.println("ext class loader =" + classLoader);
		System.out.println(classLoader.getParent());
	}
}
