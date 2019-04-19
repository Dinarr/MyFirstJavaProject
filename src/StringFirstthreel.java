import java.util.Scanner;

public class StringFirstthreel {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = input.nextLine();

			String firstThreeChars = "";
			if (arr.length >= 3) {
				firstThreeChars = arr[i].substring(0, 3);
			} else {
				firstThreeChars = arr[i];
			}
			System.out.println(firstThreeChars);
		}

	}
}
