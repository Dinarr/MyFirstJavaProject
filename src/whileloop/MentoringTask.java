package whileloop;

import java.util.Scanner;

public class MentoringTask {

	public static void main(String[] args) {
		
		String result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String number = scan.next();
		convertDigits(number);
		while(number.length()>1) {
			convertDigits(number);
		}
		
		
		
		
		
		
//		if(number.length()>3) {
//			result = "$" + number.substring(0, number.length()-3)+ "," + number.substring(number.length()-3);
//		System.out.println("Result is: " + result);	
//			
//		} else if(number.length()>6) {
//			result = "$"+number.substring(0, number.length()-4)+","+number.substring(number.length()-4);
//		System.out.println("Result is: " + result);  
//			
//		} else {
//		
//			System.out.println("Must be greater than 3 digits.");
//		}
//		
		
		
		
		
		
		
	}

	private static void convertDigits(String number) {
		// TODO Auto-generated method stub
		
	}
}
