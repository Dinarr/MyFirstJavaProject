package methods;

public class StringRevMethod {

	public static void main(String[] args) {
		
		reverseString("Dinash");
		
	}
	 public static void reverseString(String word) {
		 String reverse = "";
		 for(int i = word.length() - 1; i >= 0; i--) {
		 reverse = reverse + word.charAt(i); 
		 
		 }
		  System.out.print(reverse);
	 }
}
