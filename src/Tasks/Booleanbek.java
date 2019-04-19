package Tasks;

import java.util.Scanner;

public class Booleanbek {
	public static void main(String[] args) {
	System.out.println("Welcome to My School!");	
	int lmka5students = 15;
	double averagegpa = 4.2;
	String  nameOfTheGroupLead = "Dina";
	
	System.out.println("int: " + lmka5students);
	System.out.println("double: " + averagegpa);
	System.out.println("String: " + nameOfTheGroupLead);
	
	int width;
	int length;
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter width");
	width = input.nextInt();
	System.out.println("Please enter length");
	length = input.nextInt();
	System.out.println("Area of rectangle: " + width * length);
	System.out.println("Perimeter of rectangle: " + 2 * (width + length));
	
	
	
	
		
	}

}
