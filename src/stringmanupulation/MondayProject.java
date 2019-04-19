package stringmanupulation;

import java.util.Scanner;

public class MondayProject {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//System.out.println("Please enter number in word: ");
	// String str1 = input.nextLine();
	// str1 = str1.toLowerCase();
	// switch (str1) {
	// case "zero":
		 System.out.println("0");
	// }
		 
	String half1;
	String middle;
	String half2;
	System.out.println("Enter word: ");
	String str2 = input.nextLine();
	if (str2.length()>=3 && str2.length()<=100) {
		str2 = str2.toLowerCase();
		if (str2.length()%2 ==1) {
		//ap p le
	    // sev e nsb
			half1 = str2.substring(0, str2.length()/2);
			middle = str2.substring(str2.length()/2, str2.length()/2+1).toUpperCase();
			half2 = str2.substring(str2.length()/2+1);
			
		} else {
			// ba na na
		half1 = str2.substring(0, str2.length()/2-1);
		middle = str2.substring(str2.length()/2-1, str2.length()/2+1).toUpperCase();
		half2 = str2.substring(str2.length()/2+1);
			
		}
		System.out.println(half1+middle+half2);
		
		
		
		
	} else { 
		System.out.println("Invalid enter");
	}
		 
		 System.out.println("Enter two words(seperate with space):");
		 String str3 = input.nextLine();
		 String word1 = str3.substring(0, str3.indexOf(" "));
		 String word2 = str3.substring(str3.indexOf(" ")+1);
		 
		 System.out.println(word1.length()+ word2.length());
		 
		 word1 = word1.substring(0,1).toUpperCase()+ word1.substring(1);
		 word1 = word2.substring(0,1).toUpperCase()+ word2.substring(1);
		 System.out.println(word1 + " " + word2);
		 
		 
		 
       }
 
}
