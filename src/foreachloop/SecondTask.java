package foreachloop;

public class SecondTask {

	public static void main(String[] args) {

		String[] groceries = { "Bread", "cucumber", "apple", "orange", "cookies", "Cake" };
		int counter = 0;
		for (String grocery : groceries) {
			char c = grocery.charAt(0);
			int i = c;
			if (i >= 65 && i <= 90) {
				counter++;

			}

		}
		System.out.println("There are " + counter + 
				" words with upper case out of " + groceries.length + " words.");
	}
}
