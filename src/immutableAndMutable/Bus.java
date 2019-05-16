package immutableAndMutable;

import constructors.Item;
import encapsulation.Post;

public class Bus {

	public static void main(String[] args) {
		Item item1 = new Item("Pen", 12.99);
		Item item2 = new Item("Computer", 360); //smaller to bigger implicitly casting;
		System.out.println(item1);
		System.out.println(item2);
		item1 = item2;
		System.out.println(item1);
		System.out.println(item2);
		
		
//		Post p1 = new Post("Welcome guys!");
//		p1.info();
//		Post p2 = p1; //instead of creating new object we can point this to the same object; 
//		p2.info();
//		p1.setLikes(34);
//		p1.info();
//		p2.info();
//		System.out.println(p1);
//		System.out.println(p2);
	}
}
