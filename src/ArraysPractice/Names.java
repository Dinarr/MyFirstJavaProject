package ArraysPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Names {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("test.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String name = sc.nextLine().trim();
//			if (name.length() == 5) {
//				System.out.println(name); 
			if (name.length() > 1) { // if(name.isEmpty());
				System.out.println(name);
			}
	      
		}

	}
}
