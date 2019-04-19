import java.util.Scanner;

public class BaseClass {

	public static void printNames() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter names to print: ");
		String name = scanner.nextLine();
		System.out.println("Entered name: " + name);
	}

}
