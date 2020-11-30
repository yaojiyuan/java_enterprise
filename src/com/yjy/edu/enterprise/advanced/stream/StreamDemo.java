package com.yjy.edu.enterprise.advanced.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) throws IOException {
		createStream();
		demoStreamMethods();
		demoTerminate();
	}

	public static void demoTerminate() {
		IntStream stream = IntStream.range(1, 10);
		OptionalInt result = stream.filter((a) -> {
			return a > 5;
		}).skip(1).limit(10).map((a) -> {
			return a * 2;
		}).reduce((a, b) -> {
			return a + b;
		});
		System.out.println();
		System.out.println("sum(7*,8*2,9*2)=" + result.getAsInt());
		stream = IntStream.range(1, 10);
		stream = stream.parallel();
		List<Integer> sum = stream.filter((a) -> {
			return a > 5;
		}).skip(1).limit(10).map((a) -> {
			return a * 2;
		}).collect(() -> {
			return new ArrayList<Integer>();
		}, (a, b) -> {
			if (a.isEmpty()) {
				a.add(b);
			} else {
				a.set(0, a.get(0) + b);
			}
		}, (a, b) -> {
			int c = b.isEmpty() ? 0 : b.get(0);
			c = a.isEmpty() ? c : c + a.get(0);
			a.set(0, c);
		});
		System.out.println("sum(7*,8*2,9*2)=" + sum.get(0));
	}

	public static void demoStreamMethods() {
		IntStream stream = IntStream.range(1, 100);
		stream = stream.filter((a) -> {
			return a <= 50;
		});
		stream = stream.skip(10); // 跳过前面1-10，留下11-50
		stream = stream.limit(10);// 只留下11-20
		stream = stream.map((a) -> {
			return a * 2;
		}); // 对每个元素的值*2
		stream.forEach((a) -> {
			System.out.print(a + " ");
		});
	}

	@SuppressWarnings("unused")
	public static void createStream() throws IOException {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		Stream<String> stream = list.stream();
		String[] array = new String[] { "hello", "world" };
		stream = Arrays.stream(array);
		stream.parallel();
		IntStream intStream = IntStream.range(1, 10);
		BufferedReader bufferedReader = new BufferedReader(new FileReader("hello.txt"));
		stream = bufferedReader.lines();
		bufferedReader.close();
		Stream.generate(() -> {
			Random random = new Random(System.currentTimeMillis());
			return random.nextInt();
		});
	}
}
