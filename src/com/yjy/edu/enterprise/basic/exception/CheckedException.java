package com.yjy.edu.enterprise.basic.exception;

public class CheckedException extends Exception {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws CheckedException { 
		say("hello");
	}

	public static void say(String words) throws CheckedException {
		if (words == null) {
			throw new CheckedException();
		}
		System.out.println(words);
	}

}
