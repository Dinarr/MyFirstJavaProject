package ArraysPractice;

import java.util.Arrays;

public class FindaTWOMAXnums {

	public static void main(String[] args) {
		int[] numbers = { 23, 1, 34, 3, 54, 54, 51 };
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		int lastVal = numbers.length - 1;
		System.out.println(numbers[lastVal]);

		for (int i = lastVal; i >= 0; i--) {
			if (numbers[lastVal] != numbers[i]) {
				System.out.println(numbers[i]);
				break;
			}

		}

	}
}
