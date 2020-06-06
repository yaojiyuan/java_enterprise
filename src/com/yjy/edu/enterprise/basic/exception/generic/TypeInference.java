package com.yjy.edu.enterprise.basic.exception.generic;

import java.io.Serializable;
import java.util.ArrayList;

public class TypeInference {

	public static <T> T pick(T a1, T a2) {
		return a2;
	}
	
	public static <T> T speak(T t) {
		System.out.println("speak");
		return t;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Serializable s = pick("a", new ArrayList<String>());
	}
}
