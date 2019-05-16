package constructors;

import java.util.Scanner;

public class PhoneStore {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a model of the phone: ");
	    String m = input.nextLine();
	    System.out.println("Please enter a color of the phone: ");
	    String c = input.nextLine();
	    Phone p1 = new Phone(m, c);
	    System.out.println("Please enter a phone number to call : ");
	    long pn = input.nextLong();
	    p1.call(pn);
	    System.out.println(p1.model + " " + p1.color);
	  
		
		
		
	}
}
