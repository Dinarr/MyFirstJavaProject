package arrays;

import java.util.Arrays;

public class Search {

	public static void main(String[] args) {
		int[] numbers = { 45, 23, 6, -3, 66 };
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == -3) {

				System.out.println(i);
				break;
			}
		}
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));     //77
		int result = Arrays.binarySearch(numbers, 23); // -(5) - 1 => -6; if we put not existed target.
		System.out.println(result);

	}
}