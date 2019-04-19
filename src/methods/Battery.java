package methods;

public class Battery {

	public static void main(String[] args) {
		navigate("Cybertek", "Library");
		//Scanner sc = new Scanner(System.in); if we want to read it from user;
		//Sysout("Please enter the name");
		//String name = sc.nextLine;
		String name = "Dinash";
		checkLength(name, 6);
	}

	public static void navigate(String origin, String destination) {
		System.out.println("GPS is navigating from " + origin + " to " + destination);
	}

	public static void checkLength(String word, int number) {
		if (word.length() == number) {
			System.out.println("Equal!");

		} else {
			System.out.println("Not equal!");
		}

	}
	

}
