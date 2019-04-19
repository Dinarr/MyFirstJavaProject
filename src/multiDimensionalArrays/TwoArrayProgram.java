package multiDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

public class TwoArrayProgram {

	public static void main(String[] args) {
		//int[][] nums = twoDimArray(2, 5);
		System.out.println(Arrays.deepToString(getMultiArray(5,5)));
	}

	public static int[][] getMultiArray(int num1, int num2) {
		Random ran = new Random();
		int[][] array = new int[num1][num2];
		for (int i = 0; i < num1; i++) {
			for (int d = 0; d < num2; d++) {
				array[i][d] = ran.nextInt(100);

			}
		}

		return array;

	}

}
