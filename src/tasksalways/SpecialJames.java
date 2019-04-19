package tasksalways;

import java.util.Scanner;

public class SpecialJames {
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String firstName, lastName;
	System.out.println("Please enter your name: ");
	firstName = input.nextLine(); 
	
	if (firstName.equalsIgnoreCase("James")) {
		System.out.println("Please enter your lastname: ");
		lastName = input.nextLine();
	} 
  else {
    	lastName = "Nobody";
    }
	System.out.println("Firstname: " + firstName);
	System.out.println("Last name: " + lastName);
	}
			
}
	

