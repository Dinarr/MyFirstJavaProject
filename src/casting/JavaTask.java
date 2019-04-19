package casting;

import java.util.Scanner;

public class JavaTask {
	
     public static void main(String[] args) {
	
	 Scanner input = new Scanner(System.in);
	 System.out.println("Please enter a message:");
	 String mess = input.nextLine();
	 System.out.println("Please enter the character: ");
	 String s = input.nextLine();
	 char c = s.charAt(0);
	 System.out.println("A position of " + c + " is " + mess.indexOf(c));
	 //System.out.println("\nThe length of the task: " + task.length());
	 
	 
}
}
