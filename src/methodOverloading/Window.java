package methodOverloading;

public class Window {

	public static void main(String[] args) {
		// printArray(50,45,10,23,25,21,84);
		printMax(50, 45, 10, 23, 25, 21, 84);
	}

	// int []
	public static void printArray(int... nums) {
		for (int i : nums) {
			System.out.println(i);
		}
	}

	public static void printMax(int... nums) {
		int maxValue = nums[0]; // if we put maxv = 0; negat numbers will give error;
		for (int i : nums) {
			if (i > maxValue) {
				maxValue = i;

			}
		}
		System.out.println("Max value is: " + maxValue + ".");

	}

}
