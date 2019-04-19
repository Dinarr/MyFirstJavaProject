package MyPracticePackage;

public class DIomandsbyNum {

	public static void main(String[] args) {
		int lines = 5;
		int counter = 0;

		for (int i = 0; i < lines; i++) {

			for (int j = 1; j < lines - i; j++) {
				System.out.print(" ");
			}
             counter++;
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print(counter);
			}
			System.out.println();
		}
		
		
		for (int i = lines - 1 -1 ; i >= 0; i--) {
            counter--;
			for (int j = 1; j < lines - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print(counter);
			}
			System.out.println();
		}

	}
}
