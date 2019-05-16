package wednesdayRecap;

import java.util.Arrays;

public class ArraysMaxMin {

	public static void main(String[] args) {

		int[] grades = { 15, 25, 33, 35, 66, 44, 78, 95, 98, 1, 500 };

		//Arrays.sort(grades);
//		System.out.println("Min grade is: " + grades[0]);
//		System.out.println("Max grade is: " + grades[grades.length-1]);
//		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i : grades) {
			if (i <= min) {
				min = i;
			}
			if (i >= max) {
				max = i;
			}
		}
		System.out.println("Max " + max + "\nMin " + min);

		int maxValue = grades[0];
		int minValue = grades[0];
		for(int i = 0; i < grades.length; i++) {
			if(maxValue < grades[i]) {
				maxValue = grades[i];
			}
			if(minValue > grades[i]) {
				minValue = grades[i];
			}
		}
		System.out.println("Max value: " + maxValue);
		System.out.println("Min value: " + minValue);
	}
}
