package MyPracticePackage;
import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}
		int day = 0;
		int sum = 0;

		System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

		do {
			day++;
			sum = 0;
			for (int i = 0; i < inhabitants.length; i++) {
				inhabitants[i] = inhabitants[i] / 2;
				sum = sum + inhabitants[i];
			}
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

		} while (sum != 0);

	}

}
