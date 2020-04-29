package com.yjy.edu.enterprise.basic.type;

public class PrimitiveTypes {

	public static void main(String[] args) {
		System.out.println(String.format("byte min value=%d, max value=%d", Byte.MIN_VALUE, Byte.MAX_VALUE));
		System.out.println(String.format("short int min value=%d, max value=%d", Short.MIN_VALUE, Short.MAX_VALUE));
		System.out.println(String.format("int min value=%d, max value=%d", Integer.MIN_VALUE, Integer.MAX_VALUE));
		System.out.println(String.format("long min value=%d, max value=%d", Long.MIN_VALUE, Long.MAX_VALUE));
		System.out.println(String.format("float min value=%e, max value=%e", Float.MIN_VALUE, Float.MAX_VALUE));
		System.out.println(String.format("double min value=%e, max value=%e", Double.MIN_VALUE, Double.MAX_VALUE));
	}
}
