package com.yjy.edu.enterprise.basic.fc;

public class SwitchExpression {

	public static void dayOfWeek(int dayOfWeek) {
		switch (dayOfWeek) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednsday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
		case 7:
			System.out.println("Weekend");
			break;
		default:
			break;
		}
	}
}
