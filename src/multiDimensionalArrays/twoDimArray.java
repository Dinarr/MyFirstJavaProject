package multiDimensionalArrays;

public class twoDimArray {

	public static void main(String[] args) {
		int[][] nums = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 4, 57 } };
		printMaxValue(nums);
	}

	public static void printMaxValue(int[][] nums) {
		int max = nums[0][0];
		for (int i = 0; i < nums.length; i++) {
			for (int d = 0; d < nums[i].length; d++) {
				if (nums[i][d] > max) {
					max = nums[i][d];
				}
			}
		}
		System.out.println("Maximum: " + max);

	}
}
