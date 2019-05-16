package constructors;

import java.util.Scanner;

public class MyShop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many items you want to add?");
		int size = input.nextInt();
		input.nextLine();

		Item[] myItems = new Item[size];
		for (int i = 0; i < size; i++) {

			System.out.println("Enter name for item: " + (i + 1));
			String itemName = input.nextLine();
			System.out.println("Enter price for item: " + (i + 1));
			double itemPrice = input.nextDouble();
			input.nextLine();

			Item items = new Item(itemName, itemPrice);
			myItems[i] = items;

		}
		for (Item i : myItems) {
			i.info();
		}

	}
}
