package loops;

import java.util.Scanner;

public class PasswordCreation {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int attempts = 0;
			for (; ;) {
			System.out.println("Please enter a password: ");
			String passw = input.nextLine();
			attempts++;
			if (passw.equals("secret478")) {
				 System.out.println("Welcome to your Profile!!!");
				break; 
			}
			if (attempts == 3) { //if (i == 2)
			System.out.println("Sorry, your account is locked. Try after 5 hours");
		    break;
			}
		}
		
		
		
		
		
		
	}
}
