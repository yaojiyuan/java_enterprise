package com.yjy.edu.enterprise.basic.oop;

import com.yjy.edu.enterprise.basic.oop.classes.Street;

public class ShallowClone implements Cloneable {

	private int a;

	private Street b;

	public ShallowClone(int a, Street b) {
		if (b == null) {
			throw new IllegalArgumentException();
		}
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public Street getB() {
		return b;
	}

	public void setB(Street b) {
		this.b = b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		ShallowClone other = (ShallowClone) obj;
		return this.a == other.a && this.b.equals(other.b);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		ShallowClone clone = (ShallowClone) super.clone();
		return clone;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Street street = new Street(1, 2, 3);
		ShallowClone obj = new ShallowClone(100, street);
		ShallowClone clone = (ShallowClone) obj.clone();
		System.out.println(obj.equals(clone));
		System.out.println(obj.getB().equals(clone.getB()));
		clone.getB().setProvinceCode(10);
		System.out.println(obj.getB().equals(clone.getB()));
	}
}
