package com.yjy.edu.enterprise.basic.oop;

import javax.swing.JButton;
import javax.swing.JComponent;

public class MethodOverride {

	public void say(int a) {
		System.out.println("int call");
	}

	public void say(long a) {
		System.out.println("long call");
	}

	public void say(short a) {
		System.out.println("short call");
	}

	public void say(JComponent a) {
		System.out.println("JComponent call");
	}

	public void say(JButton a) {
		System.out.println("JButton call");
	}

	public static void main(String[] args) {
		MethodOverride instance = new MethodOverride();
		JButton button = new JButton();
		instance.say(button);
		JComponent component = button;
		instance.say(component);
		char c = 'a';
		instance.say(c);
	}
}
