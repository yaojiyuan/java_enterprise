package com.yjy.edu.enterprise.basic.fc;

public class IfFC {

	public static void ifThen(int compared) {
		int a = 10;
		if (compared > a) {
			System.out.println(compared + " is greater than " + a);
		}
	}

	public static void ifThenElse(int compared) {
		int a = 10;
		if (compared > a) {
			System.out.println(compared + " is greater than " + a);
		} else {
			System.out.println(compared + " is less than or equal to " + a);
		}
	}

	public static void ifThenElseIfElse(int compared) {
		int a = 10;
		if (compared > a) {
			System.out.println(compared + " is greater than " + a);
		} else if (compared == a) {
			System.out.println(compared + " is equal to " + a);
		} else {
			System.out.println(compared + " is less than " + a);
		}
	}

	public static void main(String[] args) {
		ifThen(13);
		ifThenElse(7);
		ifThenElseIfElse(7); 
	}
}
