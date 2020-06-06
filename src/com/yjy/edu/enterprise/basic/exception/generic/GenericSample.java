package com.yjy.edu.enterprise.basic.exception.generic;

import java.util.ArrayList;

public class GenericSample {

	public static void main(String[] args) {
		noGeneric();
		useGeneric();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void noGeneric() {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(12l);
		String firstValue = (String) list.get(0);
		Long secondValue = (Long) list.get(1);
		System.out.println(firstValue + "," + secondValue);
	}

	public static void useGeneric() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		String firstValue = list.get(0);
		String secondValue = list.get(1);
		System.out.println(firstValue + "," + secondValue);
	}
}
