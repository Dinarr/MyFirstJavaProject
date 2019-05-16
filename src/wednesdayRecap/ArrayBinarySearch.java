package wednesdayRecap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBinarySearch {

	public static void main(String[] args) {

//		String[] groceryList = { "apple", "carrot", "orange", "cherry", "strawberry"  };
//		Arrays.sort(groceryList);
//		System.out.println("Index number of apple is: " + Arrays.binarySearch(groceryList, "apple"));
//		System.out.println("Index number of orange is: " + Arrays.binarySearch(groceryList, "orange"));
//		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to DIVIDE MY ARRAY!");
		System.out.println("Enter a number that will be the size of array: ");
		int size = input.nextInt();
		int[] myArr = new int[size];
		System.out.println("Enter numbers for your array: ");

		for (int i = 0; i < size; i++) {
			myArr[i] = input.nextInt();
		}

		System.out.println("The string value of your array is: " + Arrays.toString(myArr));
		int[] firstHalf = Arrays.copyOfRange(myArr, 0, size / 2);
		int[] secondHalf = Arrays.copyOfRange(myArr, size / 2, size);
		System.out.println("The first half of your array is: " + Arrays.toString(firstHalf));
		System.out.println("The second half of your array is: " + Arrays.toString(secondHalf));
	}

}
