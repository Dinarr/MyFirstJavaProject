package whileloop;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter word: ");
		String word = input.nextLine();
		int lastIndex = word.length()-1;
		boolean check = true;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) != word.charAt(lastIndex)) {
				System.out.println("Not palindrome");
				check = false;
				break;
			}
			lastIndex--;
		}
		if(check) {
			System.out.println("Palindrome");
		}
				
	}
}
