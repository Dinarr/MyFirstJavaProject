package switchstatements;

import java.util.Scanner;

public class UnderstandingBoolean {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		boolean currentStudent;
		System.out.println("Please enter your name: ");
		name = input.next();
		System.out.println("Are you student currently? \n Yes/No");	
		String answer;
		answer = input.next();
		boolean batch;
		
		if (answer.equalsIgnoreCase("yes")) {
			currentStudent = true;
		}
		else {
			currentStudent = false;
		}
		System.out.println("Name: " + name);
		System.out.println("Current student: " + currentStudent);
		
	   if (currentStudent) {
		   
		   System.out.println(name + " you Rock!!!");
		   
		   System.out.println("Are you batch11 student? \n Yes/No");	
			String answer2;
			answer2 = input.next();
			
			if(answer2.equals("yes")) {
				System.out.println("Batch 11 students are cool");
			}
			else {
				System.out.println("ok");
			}

		}
		
	} 
		
	
}
