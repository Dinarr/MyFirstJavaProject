package casting;

import java.util.Scanner;

public class CompareNumbers {
 public static void main(String[] args) {
	
	 Scanner input = new Scanner(System.in);
	 System.out.println("Please enter a numbers: ");
	 int num1 = input.nextInt();
	 int num2 = input.nextInt();
	 int num3 =input.nextInt();
	 if (num3 > num1 && num3 > num2) {
		 System.out.println("Num3 is bigger");
	if (num2 > num1 && num2 > num3) {
		System.out.println("Num2 is bigger");
	}
	if (num1 > num2 && num1 > num3) {
		System.out.println("Num1 is bigger");
	}
	if (num1 == num2 && num2 == num3) {
		System.out.println("Numbers are equal");
	}
	 } else {
		
	 }
	 
	
}
}
