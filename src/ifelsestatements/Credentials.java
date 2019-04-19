package ifelsestatements;

import java.util.Scanner;

public class Credentials {
	
    public static void main(String[] args) {
		 String username = "Dina";
		 String password = "Dina123";
		 // write code that takes username and password from user on console
		 // check if both username and password are matching, if matching
		 //print "Welcome. %username!!!
		 //if username is correct but password is incorrect print "password is incorrect"
		 //if username is incorrect but password is correct print "username incorrect"
		 
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("Please enter your username: ");
		 String enteredUsername = input.nextLine();
		 System.out.println("Please enter password: ");
		 String enteredPassword = input.nextLine();
		 
		 if(enteredUsername.equals(username) && enteredPassword.equals(password)) {
		 System.out.println("Welcome, " + enteredUsername + "!!!");
		 }
		 else if(enteredUsername.equals(username) && !enteredPassword.equals(password)) {
			 System.out.println("Invalid password");
		}
    else if(!enteredUsername.equals(username) && enteredPassword.equals(password)) {
        	 System.out.println("Invalid username");
        	 
        }
         else {
        	 System.out.println("Invalid Credentials");
         }
         
}
}

