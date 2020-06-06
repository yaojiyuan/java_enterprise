package com.yjy.edu.enterprise.basic.oop;

public class MethodParameterPassing {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
		System.out.println("Before change, sb = " + sb);
		changeDataV1(sb);
		System.out.println("After changeData(n), sb = " + sb);
		sb = new StringBuffer("Hello ");
		System.out.println("Before change, sb = " + sb);
		changeDataV2(sb);
		System.out.println("After changeData(n), sb = " + sb);
		sb = new StringBuffer("Hello ");
		System.out.println("Before change, sb = " + sb);
		changeDataV3(sb);
		System.out.println("After changeData(n), sb = " + sb);
	}

	public static void changeDataV1(StringBuffer buffer) {
		buffer.append("World");
	}

	public static void changeDataV2(StringBuffer buffer) {
		buffer = new StringBuffer("Hello");
		buffer.append("World");
	}

	public static void changeDataV3(StringBuffer buffer) {
		StringBuffer sb2 = new StringBuffer("Hello");
		buffer = sb2;
		sb2.append("World");
	}
}
