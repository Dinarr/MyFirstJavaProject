package multiDimensionalArrays;

import java.util.Arrays;

public class InArrayHigSum {

	public static void main(String[] args) {

		int[][] nums = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 4, 57 } };
		highestSum(nums);

	}

	public static void highestSum(int[][] nums) {
		int maxSum = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int d = 0; d < nums[i].length; d++) {
				sum += nums[i][d];
			}
			if (sum > maxSum) {
				maxSum = sum;
				index = i;
			}
		}
		System.out.println(Arrays.toString(nums[index]));
	}

}
