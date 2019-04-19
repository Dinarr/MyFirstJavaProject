package ifelsestatements;

import java.util.Scanner;

public class MentTask {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 /*System.out.println("Please enter a number: ");
	 int x;
	 x = input.nextInt();
	 int remainder = x % 2;
	 
	 if (remainder == 0) {
		 System.out.println(x / 2);
	 
	 } else {
		 System.out.println((x * 3) - 1); 
		 }*/
	
	 int x, y;
	 x = input.nextInt();
	 y = input.nextInt();
	 int remainder = x % y;
	 if (remainder == 0) {
		System.out.println("Its divisible"); 
	 }
	 else {
		 System.out.println("Its not divisible");
	 }
}
}
