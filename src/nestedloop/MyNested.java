package nestedloop;

public class MyNested {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			
		for(int j=0; j<i; j++) {
			System.out.print("*");
		} System.out.println(" ");
			//System.out.println("i: " + i + " j: " + j);
		
		
	  }
		for(int i=10; i>0; i--) {
			
			for(int j=0; j<i; j++) {
				System.out.print("*");
			} System.out.println(" ");
   }
}
}