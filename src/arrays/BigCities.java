package arrays;

public class BigCities {

	public static void main(String[] args) {
		String[] cities = { "Chicago", "New York", "Madison", "Miami", "Washington" };
		boolean check = true;
		for (int i = 0; i < cities.length; i++) {
			if (cities[i].equals("Chicago")) {
				System.out.println("Windy city Chicago is found!");
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("Windy city is not found!");
		}
		int counter = 0;
		for (int b = 0; b < cities.length; b++) {
			if (cities[b].equals("Chicago")) {
				counter++;
			}
		}
		if (counter > 0) {
			System.out.println("Number of Chicago: " + counter);
		} else {

			System.out.println("Chicago is not found");  
		}

	}
}
