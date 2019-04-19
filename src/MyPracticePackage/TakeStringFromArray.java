package MyPracticePackage;

import java.util.Arrays;

public class TakeStringFromArray {
public static void main(String[] args) {
	
	System.out.println(Arrays.toString(extractNum("aa!!%$#.10aa")));
}
	public static int[] extractNum(String str) {             
        
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				str2 += str.charAt(i);
			}
		}
		String[] arr = str2.split("");
		int[] nums = new int[arr.length];
		for (int d = 0; d < nums.length; d++) {
			nums[d] = Integer.valueOf(arr[d]);
		}
		return nums;
	}
}
