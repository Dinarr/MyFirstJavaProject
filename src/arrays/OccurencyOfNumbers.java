package arrays;

import java.util.Scanner;

public class OccurencyOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word:");
		String str = input.nextLine();
		int count[] = new int[122];
		int length = str.length();

		for (int i = 0; i < length; i++)
			count[str.charAt(i)]++;

		char c[] = new char[str.length()];
		for (int i = 0; i < length; i++) {
			c[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				if (str.charAt(i) == c[j])
					find++;
			}

			if (find == 1)
				System.out.print(str.charAt(i) + ":" + count[str.charAt(i)]);
		}

	}

}
