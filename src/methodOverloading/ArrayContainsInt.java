package methodOverloading;

public class ArrayContainsInt {

	public static void main(String[] args) {
		int[] ages = { 50, 45, 25, 23, 21, 10 };
		System.out.println(arrayContainsInt(ages, 24));
	}

	public static boolean arrayContainsInt(int[] arr, int target) {
		for (int i : arr) {
			if (i == target) {
				return true;
			}
		}

		return false;
	}

}
