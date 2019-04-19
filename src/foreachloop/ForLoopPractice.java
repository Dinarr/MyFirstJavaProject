package foreachloop;

public class ForLoopPractice {

	public static void main(String[] args) {

		String[] phones = { "Iphone", "Samsung", "LG", "Google Pixel", "Motorola" };
		String[] phones2 = { "Iphone", "Samsung", "LG", "Google Pixel", "Motorola" };
		boolean equal = true;
		for (int i = 0; i < phones.length; i++) {
			String a = phones[i];
			String b = phones2[i];
			if (!(a.equals(b))) {
				equal = false;

			}
		}
		if (equal) {
			System.out.println("Two arrays are the same.");
		} else {
			System.out.println("Two arrays are different.");

		}

	}

}
