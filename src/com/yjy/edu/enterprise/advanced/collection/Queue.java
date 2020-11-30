package com.yjy.edu.enterprise.advanced.collection;

import java.util.concurrent.SynchronousQueue;

public class Queue {

	public static void synchronousQueue() throws Exception {
		SynchronousQueue<String> queue = new SynchronousQueue<>();

		Thread t = new Thread(() -> {
			try {
				for (int i = 0; i < 10; i++) {
					String words = queue.take();
					System.out.println(words);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		t.start();
		for (int i = 1; i <= 10; i++) {
			queue.put("hello" + i);
		}
	}

	public static void main(String[] args) throws Exception {
		synchronousQueue();
	}
}
