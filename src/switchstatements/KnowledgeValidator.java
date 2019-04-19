package switchstatements;

import java.util.Scanner;

public class KnowledgeValidator {

	public static void main(String[] args) {
		 //write a program that asks Grade from user
		// user must enter one character they are
		// A, B, C, D, F
		//switch based on the characters and print proper messages
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your Grade: ");
		String grade = input.nextLine();
		
		grade = grade.toUpperCase();
		if(grade.length() > 1) {
			System.out.println("Invalid data. Please enter one char.");
		}
		else {
			
		switch (grade) {
		case "A":
			System.out.println("Great job!");
		 break;
		case "B":
			System.out.println("Okay job");
		 break;
		case "C":
			System.out.println("Not bad");
		 break;
		case "D": 
			System.out.println("Work hard!");
		 break;
		case "F":
			System.out.println("Failed!");
		 break;
		default:
		System.out.println("Invalid grade");
		 }
		  }
		}
}
