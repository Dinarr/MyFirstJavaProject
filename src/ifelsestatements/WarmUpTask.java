package ifelsestatements;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Please enter three integers");
   n1 = input.nextInt();
   n2 = input.nextInt();
   n3 = input.nextInt();
   
   if (n1 == n2 && n1 == n3) {
	   System.out.println("All 3 numbers are equal.");
   }
   else  if (n1 >= n2 && n1 >= n3) {
	   System.out.println("Max number of  " + n1 + " ," + n2 + ", and " + n3 + " is " + n1);
   }
   else if (n2 >= n1 && n2 >= n3) {
	   System.out.println("Max number of " + n1 + " ," + n2 + ", and " + n3 + " is " + n2);
   }
   else  if(n3 >= n1 && n3 >= n2) {
	   System.out.println("Max number of " + n1 + " ," + n2 + ", and " + n3 + " is " + n3);
   }
   else {
	   System.out.println("Max number is: " + n3);
   }
   }
	}

