package stringmanipulation;

import java.util.Scanner;

public class Relative {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean relative = false;
		String enteredName1, enteredName2;
		System.out.println("Please enter name 1: ");
		enteredName1 = input.nextLine().trim();
		System.out.println("Please enter name 2:  ");
		enteredName2 = input.nextLine().trim();
		String lastname1 = enteredName1.substring(enteredName1.indexOf(" ")).trim();
		
		String lastname2 = enteredName2.substring(enteredName2.indexOf(" ")).trim();

	  if (lastname1.length() != lastname2.length()) {
		  relative = false;
		  System.out.println("Relative: " + relative);
		  
	  }
	if (lastname1.equalsIgnoreCase(lastname2)) {
		relative = true;
		System.out.println("Relative: " + relative); 
			
	}
		
	}
	
}
