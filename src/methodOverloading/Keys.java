package methodOverloading;

public class Keys {

	public static void main(String[] args) {
		calculate((short)45);
	}
	
	public static void calculate(short s) {
		System.out.println("Short is calculating " + s);
	}
	
	public static void calculate(int i) {
		System.out.println("Int is calculating " + i);
	}
	
	
}
