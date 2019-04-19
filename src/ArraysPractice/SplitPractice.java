package ArraysPractice;

import java.util.Arrays;

public class SplitPractice {

	public static void main(String[] args) {

		String str = "Write a program that creates a group of given size, Bella, Edward";
		String[] words = str.split(" ");
		int counter = 0;
		for (String word : words) {
			if (word.equals("program")) {
				counter++;
			}
		}
		System.out.println("Word program is written: " + counter + " time.");
		for (int i = 1; i <= 7; i++) {
			for (int j = 0; j < words.length; j++) {
				if (words[j].length() == i) {
					System.out.println(words[j]);
				}

			}
		}
		Arrays.sort(words);
		int maxLength = 0;
		for (String word : words) {
			if (word.length() > maxLength) {
				maxLength = word.length();
			}
		}

		System.out.println(maxLength);
	}

}
