package utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCollection {
	static Scanner input = new Scanner(System.in);

	public static ArrayList<String> removeDuplicates(ArrayList<String> words) {
		ArrayList<String> newList = new ArrayList<>();
		for (String w : words) {
			if (newList.contains(w)) {
				continue;

			}
			newList.add(w);
		}
		return newList;
	}

	public static ArrayList<String> filterList(ArrayList<String> words, int length) {
		ArrayList<String> result = new ArrayList<>();
		for (String word : words) {
			if (word.length() == length) {
				result.add(word);
			}
		}
		return result;
	}

	public static ArrayList<String> getStringList() {
		ArrayList<String> words = new ArrayList<String>();
		String response;
		do {
			System.out.println("Please enter String: ");
			String s = input.nextLine();
			words.add(s);
			System.out.println("Do you want to enter more? Y/N?");
			response = input.nextLine();
		} while (response.equalsIgnoreCase("y"));
		System.out.println("Your list of String is returned.");

		return words;
	}

	public static ArrayList<Integer> getIntegerList() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		String answer;
		do {
			System.out.println("Please enter Integer: ");
			Integer s = input.nextInt();
			nums.add(s);
			System.out.println("Do you want to enter more? Y/N?");
			answer = input.nextLine();
		} while (answer.equalsIgnoreCase("y"));
		System.out.println("Your list of Integer is returned.");

		return nums;
	}
}