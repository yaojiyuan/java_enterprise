package com.yjy.edu.enterprise.basic.enums;

public class EnumTypes {

	public static void main(String[] args) {
		for (Gender each : Gender.values()) {
			System.out.print(each + " ");
		}
		System.out.println();
		System.out.println(Gender.valueOf("MALE"));
		System.out.println(Gender.MALE.ordinal());
		System.out.println(3/0);
	}
}
