package methods;

import java.util.Random;

public class StringContainsMethod {

	public static void main(String[] args) {
		String s = "Dinara";
		System.out.println(removeCon(s));
		System.out.println(remove3Letters(s, "ara"));
	}

	public static String removeCon(String word) {
		word = word.toLowerCase().trim();
		if (word.contains(" ") || word.length() < 3) {
			System.out.println("Invalid data");
			return "";
		}
		if (word.contains("con")) {
			String s = word.replace("con", "");
			return s;
		} else {
			return word;
		}

	}

	public static String remove3Letters(String data, String letters) {
		data = data.toLowerCase().trim();
		if (data.contains(" ") || data.length() < 3) {
			System.out.println("Invalid data");
			return "";
		}
		if (data.contains(letters)) {
			String s = data.replace(letters, "");
			return s;
		} else {
			return data;
		}

	}

}
