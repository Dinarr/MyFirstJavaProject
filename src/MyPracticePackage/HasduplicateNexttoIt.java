package MyPracticePackage;
import java.util.Scanner;

public class HasduplicateNexttoIt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    boolean check = false;
	    int n = 5;
	    for (int i = 0; i < nums.length; i++){
	    	if(nums[i] == n && nums[i+1] == n) {
	    		check = true;
	    	}
	    	
	    }
	       
	}
}
