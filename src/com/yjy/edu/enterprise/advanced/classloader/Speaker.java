package com.yjy.edu.enterprise.advanced.classloader;

public class Speaker {
	
	Human human = new Human();
	
	static {
		System.out.println("Speaker loaded");
	}

	public void speak() {
		System.out.println("hello"); 
	}
}
