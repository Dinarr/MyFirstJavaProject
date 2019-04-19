package loops;

import java.util.Scanner;

public class ReverseTask {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("Please enter a word: ");
	 String word = input.nextLine();
	 String reverse = "";
	 // int lastIndex = word.length()-1;
	 for(int i = word.length() - 1; i >= 0; i--){ // i > o it skips first letter
		 
	 reverse = reverse + word.charAt(i); 
 }
 
 System.out.println("Reversed string is:");
 System.out.println(reverse);

	 
	 
	 
	 
	 
	 
	 
	 
}
}
