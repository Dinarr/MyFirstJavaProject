package Tasks;

	import java.util.*;

	class Main {
	  public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);  
	    
	  
	    System.out.println("Enter number:");
	    int x = input.nextInt();
	    for (int i=1; i<15; i++) {
			if (i%2==0) 
			System.out.print(x +", ");			
		}			
				
		System.out.println("\n\nDivided by 2: ");
		for (int i=1; i<15; i++) {
			if (i%3==0) System.out.print(i +", ");			
		}
				
		System.out.println("\n\nDivided by 2 & 3: ");			
		for (int i=1; i<15; i++) {
			if (i%2==0 && i%3==0) System.out.print(i +", ");			
		}
		System.out.println("\n");
	
	
}
	}
