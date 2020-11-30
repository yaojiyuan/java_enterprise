package com.yjy.edu.enterprise.basic.lambda;

public class Closure {

	@FunctionalInterface
	public static interface Speaker {

		int speak(String words);

	}

	public static void main(String[] args) {
		int delta = 3;
		Speaker s = (x) -> {
			return x.length() + delta;
		};
		System.out.println(s.speak("hello"));
	}

}
