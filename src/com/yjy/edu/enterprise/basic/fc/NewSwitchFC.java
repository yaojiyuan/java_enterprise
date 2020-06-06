package com.yjy.edu.enterprise.basic.fc;

/**
 *  Please compile this class with java12 or above 
 */
public class NewSwitchFC {

	@SuppressWarnings("preview")
	public static void printDayOfWeek(int dayOfWeek) {
		String str = switch (dayOfWeek) {
		case 1, 2 -> "Monday or Tuesday";
		case 3, 4, 5 -> "Wednsday, Thursday or Friday";
		default ->  "Weekend";
		};
		System.out.println(str); 
	}
	
	public static void main(String[] args) {
		printDayOfWeek(1);
		printDayOfWeek(3);
		printDayOfWeek(6);
	}
}
