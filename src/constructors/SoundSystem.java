package constructors;

public class SoundSystem {

	public static void main(String[] args) {

		//Speaker s1 = new Speaker("Custom PX9500");
		//Speaker s2 = new Speaker("Custom BR", 2011);
		
		Phone p1 = new Phone("Iphone X", "Gold");
		p1.text(1234567899, "love ya");
		p1.call(1234567888);
	}
}
