package MyPracticePackage;

import java.util.Scanner;

public class StringReversedSentence {

	public static void main(String[] args) {
		String s = "Java is fun";
		sentReverse(s);
		
	}

	public static void sentReverse(String sentence) {
		String[] str = sentence.split(" ");
		String reversed = "";
		for (int i = str.length - 1; i >= 0; i--) {
			reversed += (str[i] + " ");
		}
		System.out.println(reversed);

	}
}
