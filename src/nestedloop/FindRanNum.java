package nestedloop;

import java.util.Random;

public class FindRanNum {

	public static void main(String[] args) {
		Random rand = new Random ();
		int target = rand.nextInt(100);
		int attempts = 0;
		for(int i = 0; i < 100; i++) {
			attempts++;
			if(i == target) {
				System.out.println("Number is found.");
				System.out.println("Number of attempts: "+ attempts);
				System.out.println("Target: " + target);
				break;
			}
		
		
			}
		
		}
			
	
		
		
	}

