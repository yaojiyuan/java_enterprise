package com.yjy.edu.enterprise.basic.variable;

import java.util.List;

public class Variables {
	
	static int numPoints = 10;
	int x, y;
	int[] w = new int[10];
	
	public Variables(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int setX(int x) {
		int oldx = this.x;
		this.x = x;
		return oldx;
	}

	public boolean find(List<String> values, String keyword) {
		return values.stream().filter((a) -> {
			return a.equals(keyword);
		}).findFirst().isPresent();
	}

}
