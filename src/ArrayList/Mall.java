package ArrayList;

import constructors.Item;

public class Mall {

	public static void main(String[] args) {
		Store myStore = new Store("Cool Books", "600 N Michigan ave, Chicago IL");
		Item book1 = new Item("100$ startup", 14.99);
		myStore.addItem(book1);
		Item mouse = new Item("Computer mouse", 44.99);
		Item pen = new Item("Mont Blanc", 450);
		myStore.addItem(mouse);
		myStore.addItem(pen);
		myStore.seeInventory();
		System.out.println(myStore.numberOfItems);
		System.out.println("\nSelling something");
		myStore.sell("Mont Blanc");
		myStore.sell("Computer mouse");
		System.out.println(myStore.totalSales);
		myStore.refund(mouse);
		myStore.seeInventory();
		System.out.println(myStore.totalSales);
	}
}
