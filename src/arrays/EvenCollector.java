package arrays;

import java.util.Arrays;

public class EvenCollector {

	public static void main(String[] args) {

		int[] nums = { 1, 2, -3, 4, -34, 55, 78, 90, 33, 10 };
		int counter = 0;
		for (int num : nums) {
			if (num % 2 == 0) {
				counter++;
			}

		}
		System.out.println(counter);

		int[] evenNums = new int[counter];
		int i = 0;
		for (int num : nums) {
			if (num % 2 == 0) {
				evenNums[i] = num;
				i++;
			}
		}
		System.out.println(Arrays.toString(evenNums));

	}
}
