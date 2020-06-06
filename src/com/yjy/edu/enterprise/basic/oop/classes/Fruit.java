package com.yjy.edu.enterprise.basic.oop.classes;

import java.io.Serializable;

abstract class Fruit implements Serializable {

	private static final long serialVersionUID = 1L;

	public static String SPRING_SEASON = "spring";

	public static String SUMMER_SEASON = "summer";

	public static String AUTUMN_SEASON = "autumn";

	public static String WINTER_SEASON = "winter";

	protected static String RED_COLOR = "red";

	protected static String GREEN_COLOR = "green";

	protected static String YELLOW_COLOR = "yellow";

	private boolean sweet;

	private String color;

	protected float weight;

	public Fruit(boolean sweet) {
		super();
		this.sweet = sweet;
	}

	public Fruit(boolean sweet, String color) {
		this.sweet = sweet;
		this.color = color;
	}

	public boolean isSweet() {
		return sweet;
	}

	public void setSweet(boolean sweet) {
		this.sweet = sweet;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	protected abstract String getName();

	public void pack() {
		System.out.println("pack " + getName());
	}

}
