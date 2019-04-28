package MyPracticePackage;

import java.util.Scanner;

public class TwoDimArrayDuplic {
	public static void main(String[] args) {

//	  Scanner inp = new Scanner(System.in);
//    int rows = inp.nextInt(), cols = inp.nextInt();
//    int[][] arr = new int[rows][cols];
//    for(int i=0 ;i<=rows-1;i++)
//    {
//      for(int j=0 ;j<=cols-1;j++)
//      {
//        arr[i][j]=inp.nextInt();
//      }
//    }
    
    //your code here
   
    int matches = 0;
    int [][] arrays = {{2,2,1,3,4,5},{5,2,3,3,4,5},{3,2,3,1,4,5}};
    for (int d = 0; d < arrays.length; d++){
      for(int j = 0; j < arrays[d].length; j++){
    	 
        if(arrays[d][j] == arrays[d][j]){
          matches++;
        }
      }
    }
		    
    System.out.print("matches: " + matches);
  }//end main
}

