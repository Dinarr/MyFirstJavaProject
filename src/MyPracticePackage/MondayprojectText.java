package MyPracticePackage;

import java.util.Arrays;

public class MondayprojectText {

	public static void main(String[] args) {
		

	}

	static String[] words;

	public String getWord(int index) {
		if (words.length > index) {
			return words[index];
		}
		return null;
	}

	public boolean contains(String word) {
		for (String str : words) {
			if (str.equals(word)) {
				return true;
			}
		}
		return false;
	}

	public String[] addWordArray(String word, String[] array) {
		String[] newwArr = new String[array.length + 1];
		newwArr[0] = word;
		for (int i = 0; i < newwArr.length; i++) {
			newwArr[i] = array[i - 1];
		}

		return newwArr;
	}

	public boolean containsSentence(String sentence) {
		String[] wordSent = sentence.split(" ");
		int count = 0;
		for (int i = 0; i < wordSent.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (wordSent[i].equalsIgnoreCase(words[j])) {
					count++;
					break;
				}
			}

		}
		if (wordSent.length == count) {
			return true;
		} else {
			return false;
		}
	}

	public int count(String word) {
		int count = 0;
		for (String str : words) {

			if (str.equals(word)) {
				count++;
			}
		}
		return count;
	}

	public String reverseSentence(String sentence) {

		String[] wordSen = sentence.split(" ");
		String reversed = "";
		for (int i = wordSen.length - 1; i >= 0; i--) {
			reversed += (wordSen[i] + " ");
		}
		return reversed.trim();

	}

	public String[] findAnagram(String word, String[] array) {
		int counter = 0;
		for (String str : words) {
			boolean b = isAnagram(word, str);
			if (b) {
				counter++;
			}
		}
		int index = 0;
		String[] anagramArray = new String[counter];
		for (String str : words) {
			boolean b = isAnagram(word, str);
			if (b) {
				anagramArray[index] = str;
				index++;
			}

		}

		return anagramArray;
	}

	public boolean isAnagram(String word1, String word2) {
		word1 = word1.trim().toLowerCase().replace(" ", "");
		word2 = word2.trim().toLowerCase().replace(" ", "");
		if (word1.length() != word2.length())
			return false;
		String[] word1Arr = word1.split("");
		String[] word2Arr = word2.split("");

		Arrays.sort(word1Arr);
		Arrays.sort(word2Arr);

		for (int i = 0; i < word1Arr.length; i++) {
			if (!word1Arr[i].equals(word2Arr[i]))
				return false;
		}
		return true;
	}

}
