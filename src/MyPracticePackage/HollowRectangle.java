package MyPracticePackage;

public class HollowRectangle {

	public static void main(String[] args) {
		
		
		printHollowRect();
	}
	public static void printHollowRect() {
		
		 
        for (int i = 1; i <= 5; i++) { 
            for (int d = 1; d <= 5; d++) { 
                if (i == 1 || i == 5 || d == 1 || d == 5) {            
                    System.out.print("*");             
                } else {
                    System.out.print(" ");             
            } 
            
        } 
       System.out.println(); 
	}  
	    
	   
	}
}
	
	
	
	

