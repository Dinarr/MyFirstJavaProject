package ifelsestatements;

import java.util.Scanner;

public class Profile {
	
	 public static void main(String[] args) {
	//String color = "purple";
	//color.equals("red");
	//int size = color.length();
	//System.out.println(size);
	  
	//String name = "Dinara";
	//name.equals("Dina");
	//int size = name.length();
	//System.out.println(size);
	  
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter a password to create: ");
	String password = input.nextLine();
	int lengthOfPassword = password.length();
	
	if(lengthOfPassword >= 5 && lengthOfPassword <= 12) {
		System.out.println(password + " created");
	}
	else {
		
	}
		
		if(lengthOfPassword < 5) {
			System.out.println("Password length is too short");
			System.out.println("Try longer password");
		}
			else { 
				if (lengthOfPassword > 12) {
					System.out.println("Password is too long");
					System.out.println("Try shorter password");
				}
			}
		}
}