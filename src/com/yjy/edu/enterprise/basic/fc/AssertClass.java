package com.yjy.edu.enterprise.basic.fc;

public class AssertClass {
	
	public void testAssert() {
		boolean enabled = false;
		assert enabled = true;
		System.out.println("Asserts " + (enabled ? "enabled" : "disabled"));
	} 
}
