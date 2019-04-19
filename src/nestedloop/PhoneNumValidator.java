package nestedloop;

import java.util.Scanner;

public class PhoneNumValidator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean valid = true;
		System.out.println("Please enter the phone number: ");
		String phoneNum = input.nextLine();
		System.out.println(phoneNum.length());
		if(!(phoneNum.length() == 10 || phoneNum.length() == 12)) {
			valid = false;
			System.out.println("Invalid length!");
		} 
	    
		else if(phoneNum.length() == 12) {
			if(!(phoneNum.charAt(0) == '(' && phoneNum.charAt(4) == ')')){
				System.out.println("Invalid format phone number.");
		}
			
     }
	phoneNum = phoneNum.replace("(", "");
	phoneNum = phoneNum.replace(")", "");
	if(phoneNum.length() == 10) {
		for(int i = 0; i < phoneNum.length(); i++) {
			char c = phoneNum.charAt(i);
			int ii = c;
			if(ii < 48 || ii > 57) {
				valid = false;
				System.out.println("Must be numbers between 0 - 9");
				break;
			    }
		     }
	      }
		
		if(valid) {
			System.out.println("Valid phone number");
		}
		
		
	}

}

	
	

	
	

