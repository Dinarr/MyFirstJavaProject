package stringmanipulation;

import java.util.Scanner;

public class IndexPractice {

	public static void main(String[] args) {
		//String breed = "Huskeys";
		//int i = breed.indexOf("ky");        //('s',3);
		//System.out.println(i);
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a message to sent: ");
		String message = input.nextLine();
		int first = message.indexOf("heck");
		int second = message.indexOf("silly");
		int third = message.indexOf("idiot");
		System.out.println(first + ", " + second + ", " + third);
	   
		//first == -1 && second == -1 && third == -1) f>0
		
		if(first >= 0 || second >=0 || third >= 0) {
			System.out.println("Message failed!");
		}
		else {
			System.out.println("Message sent!");
		}

		
		
	}
}
