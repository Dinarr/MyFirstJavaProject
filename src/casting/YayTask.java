package casting;

import java.util.Scanner;

public class YayTask {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter symbols: ");
		String symbol = input.nextLine();
		
		System.out.println("Please enter word: ");
		String word = input.nextLine();
		
		String part1 = symbol.substring(0,2); //0, symbol.length()/2
		String part2 = symbol.substring(2);   // symbol.length()/2
		System.out.println(part1+ word + part2);
		
		
		
		
		
		
		
	}
  
}
