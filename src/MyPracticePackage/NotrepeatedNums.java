package MyPracticePackage;
import java.util.Arrays;
import java.util.Scanner;

public class NotrepeatedNums {

	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),
	    		input.nextInt(),input.nextInt(),input.nextInt()};
	    
      int size = nums.length;
      int temp = 0;
      int result = 0;
      boolean ndupl = true;
      int[] nums1 = new int[size];

    for(int i = 0;i < size; i++){
        temp = nums[i];
        for(int j=0; j<size; j++){
            if(temp == nums[j]){
                if(i != j)
                //System.out.println("Match found for "+temp);
                ndupl = false;
                break;
            }
            System.out.println(Arrays.toString(nums));
        }
    }
    
					

			

		
	}
}
