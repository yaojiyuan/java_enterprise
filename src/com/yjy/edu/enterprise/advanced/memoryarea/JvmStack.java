package com.yjy.edu.enterprise.advanced.memoryarea;

import java.util.concurrent.TimeUnit;

public class JvmStack {

	public static int f(int n) {
		if (n <= 1) {
			return 1;

		}
		int fn = f(n - 1) + f(n - 2);
		System.out.println("f(" + n + ") is " + fn);
		return fn;
	}

	public static void main(String[] args) throws Exception {
		ThreadGroup group = new ThreadGroup("default");

		Thread t = new Thread(group, new Runnable() {

			@Override
			public void run() {
				f(100);
			}
		}, "testThread", 1000);
		t.start();
		while (t.isAlive()) {
			TimeUnit.SECONDS.sleep(2);

		}
	}

}
