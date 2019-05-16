package statics;

public class Lexus {

	String model;
	int year;
	String color;
	double mileage;
	boolean isNew;
	double price;
	static int totalLexus;

	public Lexus(String model, int year) {
		this.model = model;
		this.year = year;
		totalLexus++;
	}

	public static double mileToKm(double mile) {
		return mile * 1.6;

	}

	public static void evaluateCar(Lexus lexus) {
		int age = 2019 - lexus.year;
		if (lexus.mileage < 50000 && age <= 3) {
			System.out.println("Best choice!");
		} else if ((lexus.mileage < 50000 && lexus.mileage <= 100000) && age > 3 && age < 7) {
			System.out.println("Fair choice.");
		} else if (lexus.mileage > 100000 && lexus.mileage < 200000) {
			System.out.println("You decide.");
		} else if (lexus.mileage >= 200000) {
			System.out.println("Stay away.");
		} else {
			System.out.println("Not able to evaluate.");
		}
	}

}
