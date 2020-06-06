package com.yjy.edu.enterprise.basic.oop;

public class This {

	This() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		new This();
		new This();
	}
}
