package com.yjy.edu.enterprise.basic.lambda;

public class UseLambda {

	@FunctionalInterface
	public static interface Speaker {

		int speak(String words);

	}
	
	public static int speak(Speaker speaker, String words) {
		return speaker.speak(words);
	}

	public static void main(String[] args) {
		Speaker s = (x) -> {
			return x.length() ;
		};
		System.out.println(s.speak("hello"));
		System.out.println(speak((x) -> {
			return x.length();
		}, "hello"));
	}
}
