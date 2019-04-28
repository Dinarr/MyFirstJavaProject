package objectcreationtasks;

import java.util.Scanner;

public class LibraryBooks {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter total books: ");
		int numOfBooks = sc.nextInt();
		sc.nextLine();
		Book[] books = new Book[numOfBooks];
		for (int i = 0; i < numOfBooks; i++) {
			Book b = new Book();
			System.out.println("Please enter title for book " + (i + 1) + ":");
			b.title = sc.nextLine();
			sc.nextLine();
			System.out.println("Please enter an author for book " + (i + 1) + ":");
			b.author = sc.nextLine();
			sc.nextLine();
			System.out.println("Please enter pages for book " + (i + 1) + ":");
			b.pages = sc.nextInt();
			books[i] = b;

		}
		System.out.println(books[0].title);
		System.out.println(books.length);
	}

}
