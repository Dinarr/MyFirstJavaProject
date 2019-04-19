package Inputs;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter username: ");
		String username, password;
		username = input.nextLine();
		System.out.println("Please enter password: ");
		password = input.nextLine();
		System.out.println();
		System.out.println("\t Welcome, Dinara\t" );
		System.out.println("Profile\t"   +  "\tPictures " + "\tVideos ");
		System.out.println("Posts\t"     +   "\tLikes\t "  +  "\tComments ");
		System.out.println("Products\t"  +  "\tOrders\t "  +  "\tFeedbacks " + "\n");
		
		System.out.println("Profile edit page: \n");
		System.out.println("First Name: ");
		String firstName, lastName, address;
		firstName = input.nextLine();
		System.out.println("Last Name: ");
		lastName = input.nextLine();
		System.out.println("Address: ");
		address = input.nextLine();
		System.out.println("Credit Card Number: ");
		long creditCard;
		creditCard = input.nextLong();
	
		System.out.println("\n Information you entered: ");
		System.out.println("Name: " + firstName + " " + lastName) ;
		System.out.println("Address: " + address);
		System.out.println("C C number: " + creditCard + "\n");
		
		
		System.out.println("Save now? ");
		System.out.println("> Yes ");
		System.out.println("> No " + "\n");
		input.nextLine();
		input.nextLine();
		System.out.println("Thank you!");
		
	}

}
