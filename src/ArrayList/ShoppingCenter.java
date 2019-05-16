package ArrayList;

import constructors.Item;

public class ShoppingCenter {

	public static void main(String[] args) {
		Store channel = new Store("Good Vibes", "Chicago, IL, USA");
		Item screen = new Item ("Screen ABG", 35);
		Item tire = new Item ("Good Rich", 299);
		channel.addItem(screen);
		channel.addItem(tire);
		//channel.seeInventory();
		channel.checkItem("Lipsticks");
		channel.checkItem("Good Rich");
		System.out.println(channel.totalSales);
		Item board = new Item("White Board", 90);
		channel.exchange(board, tire);
		System.out.println(channel.totalSales);
		channel.seeInventory();
	}
}
