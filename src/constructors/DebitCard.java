package constructors;

public class DebitCard {

	String cardNumber;
	String holderName;
	String type;
	int pin;
	double balance;

	public DebitCard(String cardNumber, String holderName, String type, int pin, double balance) {
		this.holderName = holderName;
		this.balance = balance;
		if (cardNumber.length() == 16) {
			this.cardNumber = cardNumber;
		} else {
			System.out.println("Invalid card number!");
		}
		if (type.equalsIgnoreCase("Mastercard") || type.equalsIgnoreCase("Visa")) {
			this.type = type;
		} else {
			System.out.println("Invalid card type!");
		}
		String pinStr = pin + "";
		if (pinStr.length() == 4) {
			this.pin = pin;
			System.out.println("Invalid pin");

		}

	}
	public static void m2() {
		System.out.println("M2 method.");
		m();
	}
	private static void m() {
		System.out.println("M method.");
	}
}
