package stringmanupulation;

public class Conversion {

	public static void main(String[] args) {
		String color = "Blue, red, yellow, white, pink, purple";
		int i = color.length();
		System.out.println(i);
		char c = color.charAt(i-1) ;  //(i-2)(23); always the last one.
		System.out.println(c);
		
		
		
		
		
		
		
		
		//boolean check = color.equals("Blue"); 
		//color.equals("Blue");
		//System.out.println(check);
		//char c = color.charAt(11); //(12)/ (32); we can't see an error before we run it
		//System.out.println(c);
		//System.out.println("End of Program");// error doesn't let to print this just brakes 
		
		
		/*double price = 44.99; ;
		boolean isSunny = true;
		String s = "";
		String result = price + s + color + s + isSunny; //color + price;
		// result --> Blue44.99;
		String priceInString = price + "";
		//System.out.println(result);
		System.out.println(priceInString);
		boolean check = s.isEmpty();
		System.out.println(check);
		*/
		
	}
}
