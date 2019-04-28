package MyPracticePackage;

import java.util.Arrays;

public class BinSearArr {

	public static void main(String[] args) {
		int [] arr = {3, 4, 1, 5, 6, 9, 0, -5, -7, 2, 11, 25, 50, 27};
   System.out.println(binarySearch(arr, 10));
	}

	public static int binarySearch(int arr[], int num) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == num) return mid;
			else if (num < arr[mid]) end = mid - 1;
			else start = mid + 1;
		}
		return start;

	}
}