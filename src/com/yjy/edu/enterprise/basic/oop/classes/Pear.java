package com.yjy.edu.enterprise.basic.oop.classes;

public class Pear extends Fruit {

	private static final long serialVersionUID = 1L;

	private static final String NAME = "pear";

	private int sugarPercentage;

	public Pear(boolean sweet) {
		super(sweet, YELLOW_COLOR);
	}

	public int getSugarPercentage() {
		return sugarPercentage;
	}

	public void setSugarPercentage(int sugarPercentage) {
		this.sugarPercentage = sugarPercentage;
	}

	@Override
	protected String getName() {
		return NAME;
	}

}
