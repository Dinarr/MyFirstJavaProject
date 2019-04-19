package MyPracticePackage;

import java.util.Arrays;

public class Print0AtTheEnd {

	public static void main(String[] args) {

		int[] nums = { 0, 3, 5, 17, 0, -28, 0, 0, 9, 13, 0, 1, 99 };
		int numIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[i];
				nums[i] = nums[numIndex];
				nums[numIndex] = temp;
				numIndex++;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
