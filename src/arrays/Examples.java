package arrays;

import java.util.Arrays;

public class Examples {

	public static void main(String[] args) {
		double[] prices = { 45.99, 23.5, 11.50, 33.33, 99.99 };
		System.out.println(Arrays.toString(prices));
		prices[4] = 112.89;
		System.out.println(Arrays.toString(prices));
		// length --> this returns an integer that is a size of array.
		System.out.println(prices.length);
		int[] numbers = { 34, 23, 5 };

	}
}
