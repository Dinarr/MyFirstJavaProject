import java.util.Arrays;
import java.util.Scanner;

public class MondayTask2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}

		int[] backup = Arrays.copyOf(inhabitants, inhabitants.length);
		int day = 0;
		System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
		int sum = 0;
		do {
			sum = 0;
			for (int i = 0; i < inhabitants.length; i++) {
				if (i != 0 && i != inhabitants.length - 1 && inhabitants[i] == 0) {
					backup[i - 1] = inhabitants[i - 1] / 2;
					backup[i + 1] = inhabitants[i + 1] / 2;
				} else if (i == 0 && inhabitants[i] == 0) {
					backup[i + 1] = inhabitants[i + 1] / 2;
				} else if (i == inhabitants.length - 1 && inhabitants[i] == 0) {
					backup[i - 1] = inhabitants[i - 1] / 2;
				}
			}
			for (int i = 0; i < backup.length; i++) {
				inhabitants[i] = backup[i];
				sum += inhabitants[i];
			}
			day++;
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

		} while (sum != 0);

		System.out.println("---- EXTINCT ----");

	}
}
