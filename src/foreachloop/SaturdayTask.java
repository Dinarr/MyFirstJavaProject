package foreachloop;

public class SaturdayTask {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int num : nums) {
			System.out.print(num + " ");
		} // double even, triple odd;
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				nums[i] = nums[i] * 2;
			} else {
				nums[i] = nums[i] * 3;
			}

		}
		System.out.println();
		//print values with space separate;
		for (int num: nums) {
			System.out.print(num + " ");
		}

	}
}
