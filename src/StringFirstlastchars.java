import java.util.Arrays;
import java.util.Scanner;

public class StringFirstlastchars {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };

		for (int i = 0; i < words.length; i++) {

			words[i] = words[i].substring(0, 1) + words[i].substring(words[i].length() - 1);

		}
		System.out.println(Arrays.toString(words));
	}
}
