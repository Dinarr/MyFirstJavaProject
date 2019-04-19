package whileloop;

public class LoginWhile {

	public static void main(String[] args) {
		int counter = 0;
		while(5 > 4) {
			System.out.println("Hi Dii! - " + counter);
			counter++;
			if (counter == 4) {
				break;
			}
			else if(counter == 2) {
				continue;
			}
			System.out.println("end of while loop");
			// counter ++;
		}
		
		
		
		
		
		
		
	}
}
