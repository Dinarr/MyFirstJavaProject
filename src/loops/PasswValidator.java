package loops;

import java.util.Scanner;

public class PasswValidator {

	public static void main(String[] args) {
		
		 System.out.println("Please enter word:");
		    Scanner scanner = new Scanner(System.in);
		    String n1 = scanner.nextLine();
		    int min = 8;
		    boolean containsOneUpperCase = false;
		    boolean containsOneLowerCase = false;
		    boolean containsOneDigit = false;
		    boolean containsOneSpecChar = false;
		    boolean passwordIsNotAccepted = false;
		    for (int i = 0; i<n1.length();i++) {
		    	char c = n1.charAt(i);
		    	if (c>64 && c<=90) {
		    		containsOneUpperCase=true;	
		    	}
		    	if (c>96 && c<=122) {
		    		containsOneLowerCase = true;
		    	}
		    	if (c>47&&c<=57) {
		    		containsOneDigit = true;
		    	}
		    	if ((c>32&&c<=47)||(c>57&&c<=64)||(c>90&&c<=96)||(c>122&& c<=126)) {
		    		containsOneSpecChar = true;
		     	}
		    	
		    }
		    
		    if(n1.length()<8) { 
		    	System.out.println("Password should contain a minimum of 8 characters.");
		    	passwordIsNotAccepted=true;
		    	}
		    if(!containsOneUpperCase) {
		    	System.out.println("Password should contain at least 1 uppercase number");
		    	passwordIsNotAccepted=true;
		    }
		    if(!containsOneLowerCase) {
		    	System.out.println("Password should contain at least 1 lowercase number");
		    	passwordIsNotAccepted=true;
		    }
		    if(!containsOneDigit) {
		    	System.out.println("Password should contain at least 1 digit");
		    	passwordIsNotAccepted=true;
		    }
		    if(!containsOneSpecChar) {
		    	passwordIsNotAccepted=true;
		    	System.out.println("Password should contain at least 1 special characters: (~`!@#$%^&*()+=_-{}[]\\|:;”’?/<>,.)");
		    }
		    if(passwordIsNotAccepted) {
		    	
		    }else {
		    	System.out.println("Your password is accepted");
		    }
		    
	   
		 
	}
}
