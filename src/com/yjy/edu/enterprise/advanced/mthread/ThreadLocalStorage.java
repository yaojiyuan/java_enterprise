package com.yjy.edu.enterprise.advanced.mthread;

import java.util.ArrayList;
import java.util.List;

public class ThreadLocalStorage {

	public static void main(String[] args) {
		useThreadLocal();
		useInheritableThreadLocal();
	}

	private static void useThreadLocal() {
		ThreadLocal<Long> var = new InheritableThreadLocal<Long>();
		List<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i <= 5; i++) {
			threads.add(new Thread(new Runnable() {

				@Override
				public void run() {
					long tid = Thread.currentThread().getId();
					var.set(tid);
					System.out.println("tid is " + tid + ",var value is  " + var.get());
				}
			}));
		}
		for (int i = 0; i < threads.size(); i++) {
			threads.get(i).start();
		}
	}

	private static void useInheritableThreadLocal() {
		ThreadLocal<Long> var = new InheritableThreadLocal<Long>();
		var.set(100l); 
		List<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i <= 5; i++) {
			threads.add(new Thread(new Runnable() {
				@Override
				public void run() {
					Long before = var.get();
					long tid = Thread.currentThread().getId();
					var.set(tid);
					System.out.println("var value is " + before + " before set, now is " + var.get());
				}
			}));
		}
		var.set(200l); //该修改子线程不感知
		for (int i = 0; i < threads.size(); i++) {
			threads.get(i).start();
		}
	}
}
