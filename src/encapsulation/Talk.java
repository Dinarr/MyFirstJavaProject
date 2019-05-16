package encapsulation;

public class Talk {

	public static void main(String[] args) {
		
		IPhone iphone = new IPhone();
		iphone.setMemory(256);
		iphone.info();
		System.out.println(iphone.getMemory());
	}
}
