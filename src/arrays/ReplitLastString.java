package arrays;

import java.util.Scanner;

public class ReplitLastString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String str = input.nextLine();
		char lastLetter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.length() >= 1) {
				lastLetter = str.charAt(str.length() - 1);

			}
		}
		System.out.println(lastLetter + str + lastLetter);

	}
}
