package stringmanupulation;

import java.util.Scanner; // modify the code to check if name is empty 
                          // if empty then print "enter valid name"
public class Tasskk {     // if not empty apply the logic

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = input.nextLine();
		
	    name = name.toLowerCase().trim();
		System.out.println("Name: " + name);
		
		if (name.isEmpty()) {
			System.out.println("Enter a valid name: ");
		} else {
			
		char first = name.charAt(0);
		int l = name.length();                     //(name.length()-1);
	    char last = name.charAt(l-1); 
	    	  
	    if(first == 'a' && last == 'z') {
	    	System.out.println("Cool!!!");
	    } else {
	    	System.out.println("Not very cool.");
	    }
	 }
	}
}

