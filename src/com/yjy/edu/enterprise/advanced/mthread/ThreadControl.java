package com.yjy.edu.enterprise.advanced.mthread;

public class ThreadControl {

	private static volatile boolean stop = false;

	public static void main(String[] args) throws InterruptedException {
		interruptThread();
		stopThread();
	}

	public static void interruptThread() throws InterruptedException {
		stop = false;
		Thread thread = createThread();
		thread.start();
		Thread.sleep(1);
		thread.interrupt();
		System.out.println("thread " + thread.getId() + " interrupted=" + thread.isInterrupted());
	}

	public static void stopThread() throws InterruptedException {
		stop = false;
		Thread thread = createThread();
		thread.start();
		Thread.sleep(1);
		stop = true;
		Thread.sleep(1);
		System.out.println("thread " + thread.getId() + " isAlive=" + thread.isAlive());
	}

	public static Thread createThread() {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				for (int i = 0;; i++) {
					System.out.println("hello world " + i);
					if (stop) {
						break;
					}
				}

			}
		};
		return new Thread(runnable);
	}
}
