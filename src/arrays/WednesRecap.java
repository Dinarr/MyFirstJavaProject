package arrays;

import java.util.Arrays;

public class WednesRecap {

	public static void main(String[] args) {

		String[] names = {"Bella", "Edward", "Dinash", "Meerim", "John", "Dii", "Aksana", "Aisu", "Iki", "Roma"};
		int counter = 0;
		String firstTwoLetters = "";
		for (int i = 0; i < names.length; i++) {
			if (names[i].startsWith("A") || names[i].startsWith("a")) {
				counter++;
				firstTwoLetters += names[i].substring(0, 2) + " ";
				
			}

		} //System.out.printf("Count is: the same thing);
		System.out.println(String.format("Count is: %s " + "and first Two letters are : %s", counter, firstTwoLetters));
	}
}
