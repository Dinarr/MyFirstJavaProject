package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchArr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] myBooks = { "Java", "My story", "Gone with the wind", "Game of thrones", "Edward & Bella" };

		System.out.println("Please enter the book to replace: ");
		String oldBook = input.nextLine();
		System.out.println("Please enter a new book: ");
		String newBook = input.nextLine();
		Arrays.sort(myBooks);
		System.out.println(Arrays.toString(myBooks));
		int result = Arrays.binarySearch(myBooks, oldBook);
		if (result >= 0) {
			myBooks[result] = newBook;
		}
		System.out.println(Arrays.toString(myBooks));

	}

}
