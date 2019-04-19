package methods;

public class Restaurant {

	public static void main(String[] args) {
		//printName();it will never work, unless we pass some string;
		printName("Edward");
		printName("Bella");
		printName("Love");
		printName("Oliver");
		printName("Vise");
		printName("Even");
	}
	
	public static void printName(String name) {
		System.out.println(name.charAt(0));
	}
	
	
	
	
	
	
	
	
	
	
	
}
