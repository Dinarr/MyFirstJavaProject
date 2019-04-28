package MyPracticePackage;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		int[] merge = { 1, 2, 3 };
		int[] merge2 = { 4, 5, 6 };
		System.out.println(Arrays.toString(mergR(merge, merge2)));
	}

	public static int[] mergR(int[] a, int[] b) {

		int[] merge = new int[a.length + b.length];
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			merge[count] = a[i];
			count++;
		}
		for (int d = 0; d < b.length; d++) {
			merge[count] = b[d];
			count++;
		}

		return merge;

	}

}
