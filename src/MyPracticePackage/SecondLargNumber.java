package MyPracticePackage;

import java.util.Arrays;

public class SecondLargNumber {

	public static void main(String[] args) {
		int [] arr = {3,4,56,78,4,56,5,3};
      System.out.println(secondLargestNum(arr));
	}

	public static int secondLargestNum(int[] arr) {
		int[] nums = new int[arr.length - 1];
		int largest = 0;
		int secondLargest = arr[0];
    for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	for (int i = 0; i < arr.length; i++) {

		if (arr[i] > largest) {
			secondLargest = largest;
			largest = arr[i];

		} else if (arr[i] > secondLargest) {
			secondLargest = arr[i];

		}
	}
	return secondLargest;
	}

}
