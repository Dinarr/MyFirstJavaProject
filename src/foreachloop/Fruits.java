package foreachloop;

import java.util.Arrays;

public class Fruits {

	public static void main(String[] args) {
		String [] favoriteFruits = {"Orange", "Apples", "Pineapple", "Mango"};
		
		for (String fruit: favoriteFruits) {
	
			if (fruit.length()%2 == 0) {
			//if(fruit.equals("Pineapple")) {
				System.out.println(fruit);
			}
			
		 }
		
		
	 }

	
}
