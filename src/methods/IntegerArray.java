package methods;

import java.util.Arrays;

public class IntegerArray {

	public static void main(String[] args) {
		int[] numbers = { 23, 53, 2, -4, 25, -45, 1 };
		System.out.println(Arrays.toString(numbers));
		arrayReplace(numbers, 100);

	}

	public static void arrayReplace(int[] numbers, int replacement) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				numbers[i] = replacement;
			}
		}
		System.out.println(Arrays.toString(numbers));
	}
}