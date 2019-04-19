package tasksalways;

import java.util.Random;
import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean sent, delivered;
		String message;
		System.out.println("Please enter your message: ");
		message = input.nextLine();
		if (message.length()>= 15) {
			sent = true;
		}
		else {
			sent = false;
		}
		//System.out.println("Message: " + message);
		//System.out.println("Sent: " + sent);
		// Task Part 2/ declare boolean for delivered status
		// generate random  number 0-10;
		// check gen numb.if even then set deliv to true
		// if number is odd set del status to false
		Random random = new Random();
		int randomNumber = random.nextInt(10);
		
		if (randomNumber % 2 == 0) {
		    delivered = true;
		} else {
			delivered = false;	
		}
		    System.out.println("Message: " + message);
		    System.out.println("Sent: " + sent);
			System.out.println("Delivered: " + delivered);
		
		
	}
}
