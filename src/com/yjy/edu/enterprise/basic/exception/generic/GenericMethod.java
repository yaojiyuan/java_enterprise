package com.yjy.edu.enterprise.basic.exception.generic;

public class GenericMethod {

	public static <T, V> V speak(T t, V v) {
		System.out.print(t);
		System.out.print(",");
		System.out.println(v);
		return v;
	}

	public static void main(String[] args) {
		speak("hello", "world");
		speak("hello", 12);
	}

}
