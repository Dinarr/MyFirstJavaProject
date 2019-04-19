package MyPracticePackage;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),input.nextInt(), input.nextInt() };
		
        int counter = 0;
        
		for (int i = 0; i < nums.length; i++) {
			for (int d = 0; d < nums.length; d++) {
				if (nums[i] == nums[d] && i!= d){
					counter++; 
					continue;
				}
			}
			if (counter == 0) {
				System.out.println(nums[i]);
			}
			counter = 0;
		}
	
	}

}
