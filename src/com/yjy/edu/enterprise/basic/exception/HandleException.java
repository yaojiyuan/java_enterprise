package com.yjy.edu.enterprise.basic.exception;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class HandleException {

	public static void main(String[] args) {
		try {
			func(1);
		} catch (IOException | TimeoutException e) {
			System.out.println("meeet exception " + e.getClass().getName());
		}

		try {
			func(2);
		} catch (IOException e) {
			System.out.println("meeet exception " + e.getClass().getName());
		} catch (TimeoutException e) {
			System.out.println("meeet exception " + e.getClass().getName());
		}
	}

	public static void func(int i) throws IOException, TimeoutException {
		if (i == 1) {
			throw new IOException();
		} else if (i == 2) {
			throw new TimeoutException();
		}
	}
}
