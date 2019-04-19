package stringmanipulation;

import java.util.Scanner;

public class NoU {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a message: ");
		String message = input.nextLine();
		message = message.replace("u", " "); 
		message = message.replace("U", " ");
		System.out.println(message);
		
		
		
		
		
		
		
		
		
		
	}
}
