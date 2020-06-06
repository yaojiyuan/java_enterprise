package com.yjy.edu.enterprise.basic.exception.generic;

import java.util.List;

public class GenericWildcard<E extends Number> {

	public static <T extends Number> void speak1(T t) {
		System.out.println("speak1");
	}

	public static <T> void speak2(List<?> list) {
		System.out.println("speak2");
	}

	public static <T> void speak3(List<? extends T> list) {
		System.out.println("speak3");
	}

	public static <T> void speak4(List<? super Integer> list) {
		System.out.println("speak4");
	}
	 
}
