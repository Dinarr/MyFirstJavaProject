package ifelsestatements;

import java.util.Scanner;

public class NestedIfelse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter an integer: ");
		int first = input.nextInt();
		int second = input.nextInt();
		int third = input.nextInt();
		if (first>second) {
			System.out.println("true");
		}else if (first<second) {
				System.out.println("false");
		}
		
		else if (third>first) {
			System.out.println("not true");
		}
		else if (third==second) {
			System.out.println("equal");
		}
		else {
			System.out.println("end of the program");
		
		
		}
	
	}
}
