package methodOverloading;

public class ArraysToString {

	public static void main(String[] args) {
		String[] colors = { "red", "blue", "white", "yellow", "pink" };
		System.out.println(toString(colors));
		int [] nums = {2,3,4,5,6,7,8};
		System.out.println(toString(nums));

	}

	public static String toString(String[] words) {
		// [di1, di2, di3];
		String result = "[";
		for (int i = 0; i < words.length; i++) {
			if (i == words.length - 1) {
				result += words[i] + "]";
			} else {
				result += words[i] + ", ";
			}
		}
		return result;

	}

	public static String toString(int[] numbers) {

		String result = "[";
		for (int i = 0; i < numbers.length; i++) {
			if (i == numbers.length - 1) {
				result += numbers[i] + "]";
			} else {
				result += numbers[i] + ", ";
			}
		}
		return result;

	}

}
