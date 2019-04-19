package casting;

import java.util.Scanner;

public class GrammTask {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String message;
	    System.out.println("Please enter your message: ");	 
	    message = input.nextLine().trim();
	    char firstChar = message.charAt(0);
	    int decimalValue = firstChar;
	    System.out.println(decimalValue);
	 if (decimalValue >= 65 && decimalValue <= 90 && (message.endsWith(".") || message.endsWith("!"))) {
		 
     System.out.println("Message is valid");
		 
	 } else {
		 System.out.println("Message is invalid");
	 }
		 boolean bb = Character.isUpperCase('e');
		 System.out.println(bb);
		 
	 }	
		
	}		
	


