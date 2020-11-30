package com.yjy.edu.enterprise.advanced.classloader;

public class Human {
	
	public Human() {
		System.out.println("create Human instance " + this.getClass().getClassLoader().getClass()); 
	}

	static {
		System.out.println("Human loaded");
	}
}
