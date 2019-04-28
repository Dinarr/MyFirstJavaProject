package MyPracticePackage;

import java.util.Arrays;

public class ArrSortbylength {

	public static void main(String[] args) {
		int[] arr = {3, 4, 1, 5, 6, 9, 0, -5, -7, 2, 11, 25, 50, 27};
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}

	public static int[] bubbleSort(int[] arr) {
		int countSwaps = 0;
		boolean swapped = true;
		int temp = 0;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < arr.length - 1 - countSwaps; i++) {
				countSwaps = 0;
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swapped = true;
				}
			}
			countSwaps++;
		}

		return arr;
	}
}
