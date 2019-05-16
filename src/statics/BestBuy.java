package statics;

public class BestBuy {

	static int numOfcomputers;
	String location;
	static String day = "Monday";

	static {
		System.out.println("First static block");
		if (day.equals("Saturday")) {
			numOfcomputers = 50;
		} else {
			numOfcomputers = 60;
		}
	}
	static {
		System.out.println("Second static block");
	}

	public void sellComputer() {
		System.out.println("Computer is sold.");
		numOfcomputers--;
	}

}
