package com.yjy.edu.enterprise.basic.lambda;

import java.util.concurrent.Callable;

public class LambdaExample {

	public static void noLambdaCallSpeak() throws Exception {
		speak(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				return 2;
			}

		});
	}

	public static void lambdaCallSpeak() throws Exception {
		speak(() -> {
			return 2;
		});
	}

	public static <V> void speak(Callable<V> v) throws Exception {
		System.out.println("call v.call");
		v.call();
	}
	
	public static void main(String[] args) throws Exception { 
		noLambdaCallSpeak();
		lambdaCallSpeak();
	}
}
