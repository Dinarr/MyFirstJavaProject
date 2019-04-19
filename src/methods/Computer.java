package methods;

public class Computer {

	public static void main(String[] args) {
		String s = "phone";
		//String str = s.substring(2);// don't forget to store it/ don't leave. s.substring(2);
		s.substring(2);
		turnOn();
		int m = getMemory();
		System.out.println(m);
	}
	
	public static int getMemory() {
		System.out.println("Returning a computer memory.");
		return 512;
	}
	public static void turnOn() {
		System.out.println("Computer is turning on!");
	}
	
	
	
	
}
