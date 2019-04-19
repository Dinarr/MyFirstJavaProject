package ArraysPractice;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] numbers = { 23, 23, 34, 56, 342, 2 };
		String res = "[";
		for (int i = 0; i < numbers.length; i++) {
			if (i == numbers.length - 1) {
				res += numbers[i] + "]";
			} else {
				res += numbers[i] + ", ";
			}

		}
		System.out.print(res);

	}
}
