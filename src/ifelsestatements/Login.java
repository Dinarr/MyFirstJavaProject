package ifelsestatements;

import java.util.Scanner;

public class Login {
	
   public static void main(String[] args) { 
	   // Get only the ages between 0 and 120 
	   // if they enter a valid age the print "valid age" else "invalid age"
	   Scanner input = new Scanner(System.in);
	   System.out.println("Welcome! Please enter your age:");
	   int age  = input.nextInt();
//	   if(age > 0 && age <= 120) { 
//		   System.out.println("valid age");
//		   
//	   }
//	   else {
//	   System.out.println("invalid age");
//	   } 
//	   
//	   
	  if (age < 0 || age > 120){
		  System.out.println("age is invalid");
	  
		  
	  }
	  else if (age >= 21 && age < 120) {
		  System.out.println("Welcome to Club");
		  
	  }
		  
	  else {
		  System.out.println("\nNot enough age!");
		  int difference = 21 - age;
		  
		  if(difference==1) {

			  System.out.println("Please come back after " + difference + " year.");
			  
		  }
		  else {
			  System.out.println("Please come back after " + difference + " years.");
		  }
	  }
	  
	  
//	    {
//		   System.out.println("Welcome to Club");
//	    
//	   }
//	    else  { 
//		   System.out.println("\nNot enough age!");
//		   int difference = 21 - age;
//		   System.out.println("Please come back after " + difference + " years.");
//	  
//	   } 
}
   
}
