package methods;

import java.util.Random;

public class MultipleDataTransfer {

	public static void main(String[] args) {

		usernameCreation("Dinara ", "Gapar");
		usernameCreation("Edward ", "Niyaz");
		usernameCreation("Bella ", "Niyaz");
	}

	public static void usernameCreation(String firstName, String lastName) {
		Random r = new Random();
		int ran = r.nextInt(50);
		firstName = firstName.toLowerCase();
		lastName = lastName.toLowerCase();
		String userName = firstName + lastName + ran;
		System.out.println(userName);
	}

}
