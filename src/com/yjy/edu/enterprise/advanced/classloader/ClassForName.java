package com.yjy.edu.enterprise.advanced.classloader;

public class ClassForName {

	public static void main(String[] args) throws ClassNotFoundException { 
		String className = "com.yjy.edu.enterprise.advanced.classloader.Speaker";
		Class.forName(className, false, ClassForName.class.getClassLoader()); 
	}
}
