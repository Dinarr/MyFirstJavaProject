package objectdatatypes;

public class Watch {
	// instance variables;
	String brand;
	String style;
	String color;
	String material;
	double price;
	String type;

	// methods/ behaviors of watch;
	public void tick() {
		System.out.println(brand + "tick - tock!");
	}

	public void showTime() {
		System.out.println(brand + " Showing todays time:");
	}

	public void showDate() {
		System.out.println(brand + " Showing todays date:");
	}

}
