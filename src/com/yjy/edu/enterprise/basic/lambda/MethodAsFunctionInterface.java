package com.yjy.edu.enterprise.basic.lambda;

public class MethodAsFunctionInterface {

	@FunctionalInterface
	public static interface Speaker {

		int speak(String words);

	}

	public static int speak(String words) {
		System.out.println(words.length());
		return words.length();
	}

	public static void call(Speaker speaker, String words) {
		speaker.speak(words);
	}

	public static void main(String[] args) {
		Speaker speaker = MethodAsFunctionInterface::speak;
		call(speaker, "hello");
	}

}
