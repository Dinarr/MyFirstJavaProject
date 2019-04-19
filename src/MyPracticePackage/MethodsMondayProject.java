package MyPracticePackage;

import java.util.Arrays;

public class MethodsMondayProject {

	public static void main(String[] args) {

	}

	public static int[] extractNum(String str) {
		// find out how many elements
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			// Character.isDigit('1') => true; if not return false;
			if (Character.isDigit(str.charAt(i))) {
				temp += str.charAt(i);
			}

		}
		int[] nums = new int[temp.length()];

		for (int d = 0; d < temp.length(); d++) {
			// valueOf
			nums[d] = Integer.parseInt("" + temp.charAt(d));
		}

		return nums;
	}

	public static boolean isAnagram(String word1, String word2) {
		word1 = word1.trim().toLowerCase().replace(" ", "");
		word2 = word2.trim().toLowerCase().replace(" ", "");
		if (word1.length() != word2.length())
			return false;
		String[] word1Arr = word1.split("");
		String[] word2Arr = word2.split("");

		Arrays.sort(word1Arr);
		Arrays.sort(word2Arr);
		// boolean b = Arrays.equals(word1Arr, word2Arr);

		for (int i = 0; i < word1Arr.length; i++) {
			if (!word1Arr[i].equals(word2Arr[i]))
				return false;
		}
		return true;
	}

	public static int secondLargestNum(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}

		return secondMax;
	}

}
