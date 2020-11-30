package com.yjy.edu.enterprise.advanced.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args) throws Exception {
		example();
		primitiveTypeClass();
		methodInClass();
		fieldInClass();
		constructorsInClass();
	}

	public static void example() throws Exception {
		Class<?> stringClass = Class.forName("java.lang.String");
		Method[] methods = stringClass.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("method " + method);
		}
		Field[] fields = stringClass.getFields();
		for (Field field : fields) {
			System.out.println("field " + field);

		}
		String s = "hello world";
		for (Method method : methods) {
			if (method.getName().equals("length")) {
				System.out.println("hello world length is " + method.invoke(s));
			}
		}
	}

	public static void primitiveTypeClass() throws Exception {
		System.out.println(int.class);
		System.out.println(int[].class);
	}

	@SuppressWarnings("unused")
	public static void getClassInstance() throws Exception {
		Class<?> stringClass = Class.forName("java.lang.String");
		stringClass = String.class;
		stringClass = Thread.currentThread().getContextClassLoader().loadClass("java.lang.String");
	}

	public static void methodInClass() throws Exception {
		// 返回所有的public方法
		String.class.getMethods();
		// 返回所有定义的方法
		String.class.getDeclaredMethods();
		Method toStringMethod = String.class.getMethod("toString");
		toStringMethod.getReturnType();
		toStringMethod.getParameters();
		toStringMethod.getAnnotations();
		String s = "hello world";
		Method subStringMethod = String.class.getMethod("substring", int.class);
		//下面的调用跟s.substring(2)是等价的
		subStringMethod.invoke(s, 2);
	}

	public static void fieldInClass() throws Exception {
		// 返回所有的public字段
		String.class.getFields();
		// 返回所有定义的字段
		String.class.getDeclaredFields();
		Field hashField = String.class.getDeclaredField("hash");
		hashField.getType();
		hashField.getModifiers();
		hashField.getAnnotations();
		hashField.setAccessible(true);
		hashField.set("heelo", 2332);
	}
	
	public static void constructorsInClass() throws Exception {
		Constructor<String> constructor = String.class.getConstructor(char[].class);
		String s = constructor.newInstance(new char[] {'a','b','c'});
		System.out.println(s);
	}

}
