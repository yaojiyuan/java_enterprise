package com.yjy.edu.enterprise.basic.oop.classes;

public class Fridge {

	private int width;

	private int heigth;

	public Fridge(int width, int heigth) {
		this.width = width;
		this.heigth = heigth;
	}

	public int getHeigth() {
		return heigth;
	}

	public int getWidth() {
		return width;
	}

	public void open() {
	}

	public void close() {
	}

	public static void main(String[] args) {
		Fridge fridge = new Fridge(120, 120);
		Fridge fridge2 = new Fridge(132, 150);
		fridge.open();
		fridge.close();
		fridge2.open();
		fridge2.close();
	}

}
