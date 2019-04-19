import java.util.Scanner;

public class PalindPractice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.nextLine().toLowerCase();
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				counter++;

			}
		}
		if (counter == 0) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");

		}

	}
}