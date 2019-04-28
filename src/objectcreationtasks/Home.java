package objectcreationtasks;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		House h1 = new House();
		
		System.out.println("Please enter type of the house: ");
		h1.type = input.nextLine();
		System.out.println("Please enter your address: ");
		h1.address = input.nextLine();
		System.out.println("Please enter number of rooms: ");
		h1.numRooms = input.nextInt();
		h1.info();
	}

}
