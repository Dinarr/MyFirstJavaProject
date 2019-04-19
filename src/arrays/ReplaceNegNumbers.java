package arrays;

import java.util.Arrays;

public class ReplaceNegNumbers {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, -3, 4, -34, 55, 78, 90, 33, 10 };
		System.out.println(Arrays.toString(numbers));
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				numbers[i] = 0;

			}

		}
		System.out.println(Arrays.toString(numbers));
//		int ii = 0;
//     for (int num: numbers) {
//    	 if(num < 0) {
//    		 numbers [ii] = 0;
//    	 }
//    	 ii++;
//     }
//     System.out.println(Arrays.toString(numbers));
//     String s = Arrays.toString(numbers);
//		s = s.replace(",", "!");
//		s = replace("[", "");
//		s = replace("]", "";)
//		System.out.println(s);

	}
}
