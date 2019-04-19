import java.util.Scanner;

public class FindMaxlengthword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];

		for (int i = 0; i < 5; i++) {

			words[i] = input.nextLine();
		}

		for (int i = 0; i < words.length - 1; i++) {
			if (words[i].length() > words[i + 1].length()) {
				String largeWord = words[i];
				words[i] = words[i + 1];
				words[i + 1] = largeWord;
				i = 0;
			}
		}
		System.out.println(words[words.length - 1]);
	}

}
