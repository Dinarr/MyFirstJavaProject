package switchstatements;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// shortcut for importing -> command + shift + o
		//-> before you use scanner you must create(it doesn't mean in the beg or later).
		int number1, number2, number3;
		System.out.println("Please enter three integers: ");
		number1 = input.nextInt();
		number2 = input.nextInt();
		number3 = input.nextInt();
		//System.out.println(number1);
		//System.out.println(number2);
		
		if(number1 > number2 && number1 > number3) {
			System.out.println("Max Number: " + number1);
		}
		else if (number1 == number2 && number1 == number3) {
			System.out.println("Numbers are equal");
		}
	 
		else {
			System.out.println("Max Number: " + number3);
		}
		
	}
}
