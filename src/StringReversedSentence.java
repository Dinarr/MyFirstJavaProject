import java.util.Scanner;

public class StringReversedSentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String[] split = sentence.split(" ");
		String reversed = "";
		for (int i = split.length - 1; i >= 0; i--) {
			reversed += (split[i] + " ");
		}
		System.out.println(reversed);

	}

}
