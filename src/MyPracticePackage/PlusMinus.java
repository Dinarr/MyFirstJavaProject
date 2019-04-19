package MyPracticePackage;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    
	    
	     plus_minus(new int [] {50, 45, -5, 0, 25, -23, 21, 0});}
	  }
		public static void plus_minus(int [] arr) {
			int [] arr1 = {50, 45, -5, 0, 25, -23, 21, 0} ;
			int counter = 0;
			for (int d = 0; d < arr1.length; d++) {
				if(arr1[d] > 0) {
					counter++;
					System.out.println("positives: " + counter);
				} else if(arr[d] < 0) {
					counter++;
					System.out.println("negatives: " + counter);
				} else {
					counter++;
					System.out.println("zeros: " + counter);
				}
			}
			
			
			
			
		}
			
	}
	
	
	
	
	
	
	
	
	
	
	

