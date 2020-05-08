package com.yjy.edu.enterprise.basic.method;

import java.util.Date;

public class FunctionArgs {

	public static int callCount;

	public static String concat(String a, String... b) {
		callCount++;
		StringBuilder builder = new StringBuilder();
		builder.append(a);
		for (int i = 0; i < b.length; i++) {
			builder.append(b[i]);
		}
		return builder.toString();
	}

	public static void printCurrentDate() {
		System.out.println(new Date());
	}

	public Date getCurrentDate() {
		return new Date();
	}

	public static void main(String[] args) {
		String e = "how";
		String f = "are";
		String g = "you";
		String h = "?";
		System.out.println(concat(e, f, g));
		System.out.println(concat(e, f, g, h));
		System.out.println("方法调用次数:" + callCount);
	}
}
