package tasksalways;

import java.util.Scanner;

public class BooleanPractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		boolean multipleWords;
		System.out.println("Please enter a string: ");
		str = input.nextLine();
		str = str.trim();
		boolean check = str.contains(" ");
		//hasMultipleWords = multipleWords.contains(" ");
		//System.out.println("String has multiple words: " + hasMultipleWords);
		
		if(str.isEmpty()) {
			System.out.println("Please enter a data: ");
		} else {
		
		
		 if (str.contains(" ")) {
			 multipleWords = true;
			 
		 } else {
			 multipleWords = false;
		 }
	System.out.println("Multiple words: " + multipleWords);
	}
}
}
