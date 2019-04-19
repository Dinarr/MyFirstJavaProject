package MyPracticePackage;

import java.util.Scanner;

public class NewReplit {

	public static void main(String[] args) {
		plus();
	}
	
	 public static void plus() {
		 
		 Scanner sc = new Scanner(System.in);
		 int result = 0;
		 System.out.println("Enter first number:");
		 int number = sc.nextInt();
		 System.out.println("Enter second number:");
		 number = sc.nextInt();
		 result = number + number;
		 System.out.println(result);
	 }
	
	
	
	
}
