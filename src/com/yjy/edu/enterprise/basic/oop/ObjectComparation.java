package com.yjy.edu.enterprise.basic.oop;

import java.util.LinkedList;

import com.yjy.edu.enterprise.basic.oop.classes.Pear;
import com.yjy.edu.enterprise.basic.oop.classes.Street;

public class ObjectComparation {

	public static void main(String[] args) {
		identityCheck();
		equalCheck();
	}

	private static void identityCheck() {
		Pear pear = new Pear(true);
		Pear anotherPear = pear;
		System.out.println(pear == anotherPear);
		anotherPear = new Pear(true);
		System.out.println(pear == anotherPear);
	}
	
	private static void equalCheck() {
		Street street = new Street(1, 1, 1);
		Street anotherStreet = new Street(1, 1, 1);
		System.out.println(street == anotherStreet);
		System.out.println(street.equals(anotherStreet)); 
		LinkedList<Street> list = new LinkedList<>();
		list.add(street);
		System.out.println(list.contains(anotherStreet)); 
	}
	
}
