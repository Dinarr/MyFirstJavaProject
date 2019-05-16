package ArrayList;

import java.util.ArrayList;

import constructors.Item;

public class Store {

	String name;
	String address;
	ArrayList<Item> storeItems = new ArrayList<>();
	int numberOfItems;
	double totalSales;

	public Store(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void addItem(Item item) {
		storeItems.add(item);
		numberOfItems++;

	}

	public void seeInventory() {
		System.out.println("\nOur inventory list:");
		for (Item i : storeItems) {
			i.info();
		}
	}

	/*
	 * for(Item item: storeItems) { if(item.name.equals(itemName)) {
	 * System.out.println(itemName + "sold for " + item.price); numberOfItems--;
	 * totalSales += item.price; storeItems.remove(item); break; }
	 */
	public void sell(String itemName) {
		for (int i = 0; i < storeItems.size(); i++) {
			if (storeItems.get(i).name.equals(itemName)) {
				System.out.println(itemName + " sold for " + storeItems.get(i).price + ".");
				numberOfItems--;
				totalSales += storeItems.get(i).price;
				storeItems.remove(i);
				break; // return; terminates the void method at any line.

			}
		}
	}

	public void refund(Item item) {
		System.out.println("Refund transaction completed for " + item.name);
		addItem(item);
		totalSales -= item.price;

	}

	public boolean checkItem(String itemName) {
		for (Item item : storeItems) {
			if (item.name.equals(itemName)) {
				System.out.println(itemName + " found in stock.");
				return true;
			}
		}
		System.out.println(itemName + " out of stock.");
		return false;
	}

	public void exchange(Item toReturn, Item toGet) {
		System.out.println(toReturn.name + " is exchanged with " + toGet.name);
		storeItems.add(toReturn);
		storeItems.remove(toGet);
		totalSales += toGet.price - toReturn.price;

	}

}
