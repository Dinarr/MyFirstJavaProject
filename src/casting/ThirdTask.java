package casting;

import java.util.Scanner;

public class ThirdTask {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a words: ");
	String first = input.nextLine();
	String second = input.nextLine();
	int i = first.length();
	int b = second.length();
	if (i < b) {
		System.out.println(first+second+first);
		
	} else if (i > b){
		System.out.println(second+first+second);
	} else {
		System.out.println("Words length are equal.");
	}
	
		
		
		
		
	}
}
