package com.yjy.edu.enterprise.basic.oop;

import com.yjy.edu.enterprise.basic.oop.classes.Apple;
import com.yjy.edu.enterprise.basic.oop.classes.Pear;

public class StaticClassMember {

	private static String os;
	
	private static String className = StaticClassMember.class.getName();
	
	static {
		System.out.println(className);
		os = System.getProperty("os.name");
	}

	public static void printOS() {
		System.out.println(os);
	}

	public static void main(String[] args) {
		System.out.println(Pear.AUTUMN_SEASON);
		System.out.println(Apple.AUTUMN_SEASON);
		System.out.println(Apple.NAME);
		printOS();
	}

}
