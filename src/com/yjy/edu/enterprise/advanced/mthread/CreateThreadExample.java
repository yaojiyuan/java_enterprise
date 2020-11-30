package com.yjy.edu.enterprise.advanced.mthread;

public class CreateThreadExample {

	public static void main(String[] args) throws Exception {
		Thread thread1 = createThreadV1();
		Thread thread2 = createThreadV2();
		thread1.start();
		thread2.start();
		Thread.sleep(1000);
	}

	public static Thread createThreadV1() {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("hello thread " + Thread.currentThread().getId());

			}
		};
		return new Thread(runnable);
	}

	public static Thread createThreadV2() {
		return new Thread() {

			@Override
			public void run() {
				System.out.println("hello thread " + Thread.currentThread().getId());
			}

		};
	}
}
