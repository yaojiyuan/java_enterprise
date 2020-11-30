package com.yjy.edu.enterprise.advanced.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		hashMap();
		linkedHashMap();
		treeMap();
	}

	public static void hashMap() {
		// 初始capacity为4
		HashMap<Key, Integer> map = new HashMap<>(4, 1f);
		map.put(new Key(1), 1);
		map.put(new Key(2), 2);
		map.put(new Key(3), 3);
		map.put(new Key(4), 4);
		// 这次操作会触发增大bucket的数量到8
		map.put(new Key(5), 5);
		map.put(new Key(11), 11);
		map.put(new Key(6), 6);
		map.put(new Key(7), 7);
		// 这次操作会触发增大bucket的数量到16
		map.put(new Key(8), 8);
		map.put(new Key(9), 9);
	}

	public static void linkedHashMap() {
		// 初始capacity为4
		HashMap<Key, Integer> map = new LinkedHashMap<>(4, 1f);
		map.put(new Key(5), 1);
		map.put(new Key(6), 2);
		map.put(null, 3);
		map.put(new Key(1), 3);
		map.put(new Key(2), 4);
		map.forEach((k, v) -> {
			System.out.print("{" + (k == null ? null : k.key) + ":" + v + "}");
		});
		System.out.println();
	}

	public static void treeMap() {
		TreeMap<Integer, Integer> map = new TreeMap<>((a, b) -> {
			return a - b;
		});
		map.put(1, 1);
		map.put(8, 8);
		map.put(6, 6);
		map.put(3, 3);
		map.put(11, 11);
		map.forEach((k, v) -> {
			System.out.print("{" + k + ":" + v + "}");
		});
		System.out.println();
	}

	public static class Key {

		private int key;

		public Key(int key) {
			this.key = key;
		}

		@Override
		public int hashCode() {
			System.out.println("hash code of " + key + " is " + key);
			return key;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null || getClass() != obj.getClass())
				return false;
			Key other = (Key) obj;
			return this.key == other.key;
		}
	}
}
