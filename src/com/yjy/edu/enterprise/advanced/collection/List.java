package com.yjy.edu.enterprise.advanced.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class List {

	public static void arrayList() {
		ArrayList<String> list = new ArrayList<>(7);
		list.addAll(Arrays.asList("h", "e", "l", "l", "o"));
		list.add("w");
		list.add(3, "e");
		list.add("l");
		list.forEach((a) -> {
			System.out.print(a + ",");
		});
		System.out.println();
	}

	public static void linkedList() {
		LinkedList<String> list = new LinkedList<>();
		list.addFirst("h");
		list.add("e");
		list.add("l");
		list.add("l");
		list.add(2, "o");
		list.forEach((a) -> {
			System.out.print(a + ",");
		});
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		arrayList();
		linkedList();
	}

}
