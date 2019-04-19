package casting;

public class Prime {

	public static void main(String[] args) {
		String s = "54.2";
		double d = Double.valueOf(s);
		int i = (int)d; // explicit casting,(converting);
		short ss = 5;
		int ii = ss;
		System.out.println(i);
	}
}
