package MyPracticePackage;
import java.util.Scanner;

public class SplitEmail {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    
	    if(email.indexOf("@") < 0 || email.indexOf("@") < email.lastIndexOf("@")) {
	    	System.out.println("invalid email:");
	    }
	    String [] arr = email.split("@");
	    System.out.println("Email id: "  + arr[0]);
	    System.out.println("Email domain: " + arr[1]);
	    
		
	}

}
