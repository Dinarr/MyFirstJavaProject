package arrays;

import java.util.Scanner;

public class studTask {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] students = { "James", "John", "Adam", "Elize", "Jamie", "Benzema" };
		int size = students.length;
		System.out.println("Please enter your keyword: ");
		String keyword = input.next();
		for (int i = 0; i < size; i++) {
			if (students[i].contains(keyword)) {
				String student = students[i];
				System.out.println(student);

			}

		}
	}

}
