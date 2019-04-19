package MyPracticePackage;

public class CalculateValueOfInt {

	public static void main(String[] args) {
		int[] numbers = { 0, 3, 5, 17, 0, -28, 0, 0, 9, 13, 0, 1, 99 };
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		// sum = sum/numbers.length;
		// System.out.println(sum);

		int max = numbers[0];
		int min = numbers[0];
		for (int d = 0; d < numbers.length; d++) {
			if (numbers[d] > max) {
				max = numbers[d];
			} else if (numbers[d] < min) {
				min = numbers[d];
			}

		}
		sum = (sum - min - max) / numbers.length;
		System.out.println(min);
		System.out.println(max);
		System.out.println(sum);
	}
}
