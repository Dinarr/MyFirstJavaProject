package ifelsestatements;

import java.util.Scanner;

public class CreateAccount {
     public static void main(String[] args) {
    	 Scanner input = new Scanner(System.in);
    	 
	String username1 = "Dina";
	String username2 = "Meka";
	System.out.println("Please enter your username to create: ");
	String enteredUsername = input.nextLine();
	if(enteredUsername.equals(username1) || enteredUsername.equals(username2)) {
		System.out.println("username taken");
	}
	else { 
		System.out.println("username created!\n");
		
		System.out.println("Please enter a password to create: ");
		String password = input.nextLine();
		int lengthOfPassword = password.length();
		
		if (lengthOfPassword >= 5 && lengthOfPassword <= 12) {
			System.out.println("Password created succesfully\n");
			System.out.println("Congrats, account is created successfully!");
			System.out.println("username: " + enteredUsername);
			System.out.println("password: " + password);
		}
		else {
			System.out.println("Invalid password, please enter length between 5 and 12");
		}
	} 
	
       System.out.println("\nEnd of Program");
		
}			
				
}	
	
			
	

