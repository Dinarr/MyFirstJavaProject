package MyPracticePackage;
import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String di = scanner.nextLine();
	    String result = "";
		for(int i = 0; i < di.length();i++) {
			char c = di.charAt(i);
			if ( result.contains(c + "")) {
				continue;
			}
			result += c;	
		
		} System.out.println(result);
		
		
		
		
		
		
	   }
	}

	


