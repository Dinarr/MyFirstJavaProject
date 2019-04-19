package MyPracticePackage;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "silent"));
		System.out.println(isAnagram("heart", "earth"));

	}

	public static boolean isAnagram(String word1, String word2) {
		boolean check = true;

		if (word1.length() != word2.length()) {
			check = false;

			for (int i = 0; i < word1.length(); i++) {
				if (word2.contains(word1.substring(i, i + 1))) {
					check = false;
				}
			}
		}
		return check;
	}
}
