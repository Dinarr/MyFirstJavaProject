package arrays;

public class UniqueNumSec {

	public static void main(String[] args) {

		int[] numbers = { 5, 7, 8, 8, 11, 55, 23, 23, 23, 54, 7, 1, 2, 2 };
		int result = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int d = 0; d < numbers.length; d++) {
				if (numbers[i] == numbers[d]) {
					result++;
				}
			}
			result -= 2;
			if (result < 0) {

				System.out.print(numbers[i] + " ");
			}
			result = 0;
		}
	}
}