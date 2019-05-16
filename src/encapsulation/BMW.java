package encapsulation;

public class BMW {

	private String model;
	private int year;
	private String color;
	private double price;
	static int totalCars;

	public BMW(String model, int year) {
		this.model = model;
		setYear(year);
		totalCars++;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= 1900 && year <= 2019) {
			this.year = year;
		} else {
			System.out.println("Please enter a valid year.");
		}

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0 && price <= 1000000) {
			this.price = price;
		} else {
			System.out.println("Enter a valid price.");
		}

	}

	public void drive() {
		System.out.println(this.model + " is driving.");
	}

	public void stop() {
		System.out.println(this.model + " is stopping.");
	}

	public static void wash(BMW x6) {
		System.out.println(x6.model + " is washed. ");
	}
}
