package com.yjy.edu.enterprise.basic.fc;

public class BreakLabel {

	public static void main(String[] args) {
		outer: for (int i = 0; i < 10; i++) {
			System.out.print("i={" + i + ", j=");
			for (int j = 0; j <= 10; j++) {
				if (i == 3 && j == 5) {
					System.out.println("}");
					break outer;
				}
				System.out.print(j + " ");
			}
			System.out.print("}");
			System.out.println();
		}
	}

}
