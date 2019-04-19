package methods;

public class Phone {

	public static void main(String[] args) {
		boolean b = isWeatherSunny("Monday");
		System.out.println(b);
		if(b) {
			System.out.println("Let's go picnic.");
		} else {
			System.out.println("Let's code.");
		}

	}

	// return type method
	// method returns boolean
	// method accepts String
	public static boolean isWeatherSunny(String day) {
		if (day.equals("Monday")) {
			return true; // if we don't use else program terminates after executing first st.
		} else {
			System.out.println(day + " is a not sunny.");
			return false; // we can use just return false but it will be not correct.
		}
	}

}
