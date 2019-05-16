package MyPracticePackage;

public class PrimeNumfind {
	public static void main(String[] args) {

		displayPrimeNumbers(50);

	}

	public static void displayPrimeNumbers(int numbers) {
		for (int i = 0; i <= numbers; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}

	public static boolean isPrime(int numbers) {
		if (numbers < 2) {
			return false;
		}
		for (int i = 2; i <= numbers / 2; i++) {
			if (numbers % i == 0) {
				return false;

			}
		}
		return true;

	}

}
