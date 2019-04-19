package whileloop;

import java.util.Scanner;

public class TransAmount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int balance = 1500;
		int transactionAmount;
		
	while(balance > 0) {
		System.out.println("Please enter transaction amount: ");
		transactionAmount = input.nextInt();
		input.nextLine();
		System.out.println("Enter Item name:");
		String itemName = input.nextLine();
		if (itemName.equalsIgnoreCase("ak-47")) {
			System.out.println("Illegal item!");
			break;
		}
		if (transactionAmount > balance) {
			System.out.println("Transaction amount is too high! Try lower price.");
			continue;	
		}
		balance = balance - transactionAmount;
		System.out.println(itemName + " purchased succesfully");
	}
	if (balance == 0) {
	System.out.println("You are broke."); }
	
	System.out.println("Your balance: " + balance);
	}
		
	}

