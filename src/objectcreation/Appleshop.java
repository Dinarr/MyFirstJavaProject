package objectcreation;

public class Appleshop {

	public static void main(String[] args) {
		Apple a1 = new Apple();
//		a1.color = "Red";
//		a1.size = 7;
//		a1.taste = "Sweet";
//		a1.type = "Macintosh";
		a1.setValue(5, "Golden", "yellow", "sweet");
		a1.info();
    	/*Apple a2 = new Apple();
		a2.color = "Green";
		a2.size = 4;
		System.out.println();
		a2.info(); */

	}

}
