package arrays;

public class Colourtask {

	public static void main(String[] args) {
		String [] colors = {"Red", "Rose", "White", "Black"};
		int size = colors.length;
		for (int i = 0; i < size; i++) {
			//System.out.println("Colors: " + colors[i]);
			if(colors[i].length() >= 4) {
				System.out.println(colors[i]);
			 }
		 }		
				
	 }
}
