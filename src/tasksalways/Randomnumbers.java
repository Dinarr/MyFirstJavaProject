package tasksalways;

import java.util.Random;
import java.util.Scanner;

public class Randomnumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		//shortcut for importing the classes command+shift+o
		int secretNumber = random.nextInt(10); 
		System.out.println("Please enter your guess between 0 and 10: ");
		int enteredNumber = input.nextInt();
		int enteredNumber2 = input.nextInt();
		boolean rightNumber = input.nextBoolean();
		
		if (enteredNumber > secretNumber) {
			System.out.println("You lost!");
		}
		else if (enteredNumber < secretNumber) {
			System.out.println("You lost!");
		}
		else if (enteredNumber2 == secretNumber) {
			rightNumber = true;
			System.out.println("Congrats, you got it! "); 
		  
		} else {
		   }
		 
		System.out.println("Secret number was: " + secretNumber);
		
		// give the second chance to the user to guess the number
		// if they find the number print "congratulations" if not print "lost" 
	}
}
