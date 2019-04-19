package MyPracticePackage;

import java.util.Arrays;

public class RunnerClass {
	
	
	static String[][][] threeDArray = { { { "1", "2" }, { "3", "4" }, { "5", "6" } } };

	public static void main(String[] args) {
		twoDimArrays twoDimArrays = new twoDimArrays();
		System.out.println(Arrays.toString(twoDimArrays.getNumber(twoDimArrays.threeDArray)));
		 
		
	}
}