package com.yjy.edu.enterprise.advanced.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ConcurrentMException {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(7);
		list.addAll(Arrays.asList("h", "e", "l", "l", "o"));
		list.add("w");
		list.add(3, "e");
		list.add("l");
		list.forEach((a) -> {
			if (Objects.equals("w", a)) {
				list.remove(a);
			}
		});
	}
}
