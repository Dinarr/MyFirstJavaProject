package MyPracticePackage;

public class SentReverse {

	public static void main(String[] args) {
		String s = reverseWords("Java is fun");
		System.out.println(s);

	}

	public static String reverseWords(String sentence) {
		sentence = sentence.trim();
		String[] sen = sentence.split(" ");
		String reversed = "";
		for (int i = 0; i < sen.length; i++) {
			//String word = sen[i];
			//reversed += reverse(word) + " ";
			reversed += reverse(sen[i]) + " ";
		}

		return reversed.trim();
	}

	private static String reverse(String word) {
		word = word.trim();
		String result = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			result += word.charAt(i);
		}
		return result;
	}
}
