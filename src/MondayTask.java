import java.util.Arrays;
import java.util.Scanner;

public class MondayTask {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();

			boolean zero;
			int count = 0;

			do {
				zero = true;
				System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
				for (int d = 0; d < inhabitants.length; d++) {
					if (inhabitants[d] > 0) {
						inhabitants[d] = inhabitants[d] / 2; // inhabitants[d] /=;
						zero = false;
					}
				}
				count++;

			} while (!zero);
			System.out.println("---- EXTINCT -----");

		}

	}
}
