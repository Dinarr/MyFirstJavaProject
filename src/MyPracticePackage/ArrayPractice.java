package MyPracticePackage;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {

		String[] one = { "a", "e", "d", "m", "c", "k", "t", "e" };
		String[] two = { "a", "o", "c", "k", "j", "p", "f", "d" };
		String result = "";
		for (int i = 0; i < one.length; i++) {
			for (int d = 0; d < two.length; d++) {
				if (one[i].equals(two[d])) {
					if (!result.contains(one[i])) {
						result += one[i] + " ";
					} else {
						continue;
					}
				}
			}
		}
		System.out.println(result);
		String[] resultArr = result.split(" ");
		System.out.println(Arrays.toString(resultArr));
	}
}
