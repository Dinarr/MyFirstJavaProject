package Tasks;

import java.util.Scanner;

public class MondayProject {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number:");
	    int x = input.nextInt();					
		for (int i=1; i<=x; i++) {
			if (i%2==0 && i%3==0) System.out.print(i*i + " ");	
	
		}
		System.out.println("Enter word:");
		String str1 = input.next();
		
		if(str1.length()>=3 && str1.length()<=100) {
		String temp = "";	
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i)>=48 && str1.charAt(i)<=57) {
			temp += str1.charAt(i);	
			
			}
		}
		System.out.println(temp);	
			
			
		} else {
			System.out.println("Invalid enter");
		}
		
		
		int counterP = 0;
		int counterN = 0;
		int counterZ = 0;
		String yn = "";
		
		do {
			System.out.println("Enter the number:");
			int number = input.nextInt();
		if(number>0) {
			counterP++;
			
		} else if (number<0) {
			counterN++;
		}
		else {
			counterZ++;
		}
			System.out.println("Do you want to continue y/n?");
			 yn = input.next();
		while (!yn.equals("y")&& !yn.equals("n")) {
			System.out.println("Please enter valid answer y/n?");
			yn = input.next();
		}
			 
		} while(yn.contentEquals("y"));
		
		
		
		
		
		
		
		
		
		
		
	  }
		
  }

