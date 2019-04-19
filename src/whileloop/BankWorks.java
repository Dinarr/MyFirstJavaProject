package whileloop;

import java.util.Scanner;

public class BankWorks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String itemName = null;
		int transaction;
		while (itemName != "AK-47") {
			System.out.println("Please enter an item name: ");
			itemName = input.nextLine();
			if (itemName.equals("AK-47"))
			System.out.println("Illegal item!");
			break;
		}  
			System.out.println(itemName + " purchased succesfully!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
