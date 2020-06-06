package com.yjy.edu.enterprise.basic.exception;

public class UncheckedExcetpion extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		say("hello");
	}

	public static void say(String words) {
		if (words == null) {
			throw new UncheckedExcetpion();
		}
		System.out.println(words);
	}

}
