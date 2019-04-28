package MyPracticePackage;

import java.util.Arrays;

public class MultiplTableArrays {

	public static void main(String[] args) {
		int[][] multiplicationTable = new int[10][10];
		int num1 = 1;

		for (int i = 0; i < multiplicationTable.length; i++) {
			int num2 = 1;
			for (int d = 0; d < multiplicationTable[i].length; d++) {
				multiplicationTable[i][d] = num1 * num2;
				num2++;

			}
			num1++;

		}

		System.out.println(Arrays.deepToString(multiplicationTable));
	}
}
