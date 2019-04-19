package whileloop;

import java.util.Scanner;

public class WhileLoopTasks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String original, reverse = "";
	   

	    System.out.println("Enter a string to check: ");
	      original = input.nextLine();
	      int length = original.length();
	     
	      for (int i = length - 1; i >= 0; i--) { 
	         reverse = reverse + original.charAt(i);
	          }
	      if (original.equals(reverse)) {
	         System.out.println("The word is a palindrome.");
	      } else {
	    	 
	         System.out.println("The word isn't a palindrome.");
	      }
	      
	      
	      
		
	}
}
