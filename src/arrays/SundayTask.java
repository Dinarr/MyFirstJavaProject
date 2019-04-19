package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SundayTask {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the number of cars you own: ");
		int numOfCars = input.nextInt();
		input.nextLine();
		String [] mycars = new String [numOfCars];
		System.out.println(Arrays.toString(mycars));
		//for(int i = 0; i < numOfCars; i++) {
		//}
		//System.out.println(Arrays.toString(mycars));
//		mycars[0] = "BMW";
//		mycars[numOfCars-1] = "Mersedes";
//		System.out.println(Arrays.toString(mycars));
		for (int b = 0; b < numOfCars; b++) {
		System.out.println("Enter car " + (b + 1)+ ":");
		String carName = input.nextLine();
		mycars[b] = carName;
	    System.out.println(Arrays.toString(mycars)); //numOfCars = mycars.length;
	    
	       }
		int a = 0;
		for(int d = 0; d < mycars.length; d++) {
			
			if(mycars[d].equalsIgnoreCase("BMW") || mycars[d].equalsIgnoreCase("Mercedes")) {
				System.out.println("You have a German cars!");
				a++;
				break;
			   }
					
			}
		if(a == 0) {
			System.out.println("You don't have a German car!");
		   }

		}
	}
	

		

	


