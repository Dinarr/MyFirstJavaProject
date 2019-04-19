package methods;

import java.util.Arrays;
import java.util.Random;

public class RandomMethodArrays {

	public static void main(String[] args) {
		int[] array = getArray(10, 100);
		System.out.println(Arrays.toString(array));
		System.out.println(returnEven(array));

	}
	
	public static int returnEven(int [] numbers) {
	    int counter = 0;
	    for(int i: numbers) {
			if(i % 2 == 0) {
				counter++;
			} 
		}
		return counter;
	
	}
	

	public static int[] getArray(int size, int bound) {
		int[] nums = new int[size];
		Random random = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(bound);

		}
		return nums;
	}

}
