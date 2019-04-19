package MyPracticePackage;

import java.util.Arrays;

public class twoDimArrays {

	public static void main(String[] args) {

		String[][][] threeDArray = { { { "1", "2" }, { "3", "4" }, { "5", "6" } } };
		System.out.println(Arrays.toString(getNumber(threeDArray)));

	}

	static String[][][] threeDArray = { { { "1", "2" }, { "3", "4" }, { "5", "6" } } };

	public static String[] getNumber(String[][][] value) {
		String target = "";
		String[] result = new String[1];
		for (int i = 0; i < value.length; i++) {
			for (int d = 0; d < value[i].length; d++) {
				for (int c = 0; c < value[i][d].length; c++) {
					if (value[i][d][c].equals("3")) {
						result[0] = value[i][d][c];

					}
				}
			}
		}

		return result;
	}

}
