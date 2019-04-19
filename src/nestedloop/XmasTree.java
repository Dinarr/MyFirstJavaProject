package nestedloop;

import java.util.Scanner;

public class XmasTree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Christmas tree!");
		for (int i = 0; i < 10; i++) {
		for (int b = 0; b < 10 - i; b++) 
		    System.out.print(" ");
		for (int c = 0; c < (2 * i + 1); c++) 
		    System.out.print("*");
		   System.out.println();
		
		}
		
		
		}
		
		
		
		
		
		
	}

