package com.yjy.edu.enterprise.basic.oop.classes;

public class Apple extends Fruit {

	private static final long serialVersionUID = 1L;

	public static final String NAME = "apple";

	private String brand;

	public Apple() {
		super(true);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	protected String getName() {
		return NAME;
	}

}
