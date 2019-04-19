package MyPracticePackage;

public class AddArray {

	public static void main(String[] args) {
		
		
	}
	int size = 0;    
    int[] origArray = new int[size+1]; 

	public static void add_n_r(int []r, int n){
		int size = 0;    
	    int[] origArray = new int[size+1]; 
	    int[] tempArray = new int[size+1];    
	    System.arraycopy(origArray, 0, tempArray, 0, size);
	    origArray = tempArray;
	    size++;         
	}
	
	
	
	
	
	
	
	
	
	
}
