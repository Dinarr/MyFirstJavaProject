package casting;

public class PrimitiveCasting {

	public static void main(String[] args) {
		short s = 445;
		int age = s;
		System.out.println(age);
		int size = age;
		System.out.println(size);
		byte b = (byte)size;
		System.out.println(b);
		byte b2 = (byte)s;
		double d = 45.6; // floating part
		int ss = (int)d;
		System.out.println(ss);
		//String str = "0.81 seconds";
		//double seconds = Double.valueOf(str);
		//System.out.println(seconds + 1);
		System.out.println();
		String wall = "4652";
		int w = Integer.valueOf(wall);
		if (w < 5000) {
			System.out.println("Cool");
		}
	}
}
