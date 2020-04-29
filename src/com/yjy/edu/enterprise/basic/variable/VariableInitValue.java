package com.yjy.edu.enterprise.basic.variable;

public class VariableInitValue {
	static int a;
	static long b;
	static float c;
	static double d;
	static short e;
	static boolean f;
	static char g;
	static byte h;
	static String i;
	static int[] j;
	
	public static void main(String[] args) {
		Integer a = 34;
		int b = a;
		System.out.println(" int 默认初始值 = " + a);
		System.out.println(" long 默认初始值 = " + b);
		System.out.println(" float 默认初始值 = " + c);
		System.out.println(" double 默认初始值 = " + d);
		System.out.println(" short 默认初始值 = " + e);
		System.out.println(" boolean 默认初始值 = " + f);
		System.out.println(" char 默认初始值 = " + g);
		System.out.println(" byte 默认初始值  = " + h);
		System.out.println(" String 默认初始值 = " + i);
		System.out.println(" int[] 默认初始值 = " + j);
	}
}
