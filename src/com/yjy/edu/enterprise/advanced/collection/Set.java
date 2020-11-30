package com.yjy.edu.enterprise.advanced.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class Set {

	public static void hashSet() {
		HashSet<String> set = new HashSet<>();
		set.add("h");
		set.add("e");
		set.add(null);
		set.add("l");
		// 添加重复元素
		set.add("l");
		set.forEach((a) -> {
			System.out.print(a + ",");
		});
		System.out.println();
	}

	public static void copyOnWriteArraySet() {
		CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
		set.add("h");
		set.add("e");
		set.add("l");
		set.add("o");
		set.add("w");
		set.add("r");
		set.add("d");
		set.forEach((a) -> {
			if (Objects.equals(a, "w")) {
				set.remove(a);
			}
		});
		set.forEach((a) -> {
			System.out.print(a + ",");
		});
		System.out.println();
	}

	public static void linkedHashSet() {
		HashSet<String> set = new LinkedHashSet<>();
		set.add("h");
		set.add("e");
		set.add(null);
		set.add("l");
		// 添加重复元素
		set.add("l");
		set.forEach((a) -> {
			// 元素按添加的顺序打印
			System.out.print(a + ",");
		});
		System.out.println();
	}

	public static void treeHashSet() {
		TreeSet<String> set = new TreeSet<>();
		set.add("h");
		set.add("e");
		set.add("w");
		set.add("l");
		set.forEach((a) -> {
			// 元素从小到大的顺序打印
			System.out.print(a + ",");
		});
		System.out.println();
	}

	public static void main(String[] args) {
		hashSet();
		linkedHashSet();
		treeHashSet();
		copyOnWriteArraySet();
	}

}
