package methodOverloading;

import java.util.Arrays;

public class CopyArrayGiveNewValue {

	public static void main(String[] args) {
		String[] array = { "Dina", "Meka", "Di", "Mekus" };
		String[] newArray = addArray(array, "Dii");
		System.out.println(Arrays.toString(newArray));
		int num = 1;
		String[] newArr = insertValue(array, "Dii", num);
		System.out.println(Arrays.toString(newArr));
	}

	public static String[] addArray(String[] arr, String value) {
		int size = arr.length;
		int size2 = size + 1;
		String[] tempArray = new String[size2];
		for (int i = 0; i < size; i++) {
			tempArray[i] = arr[i];
		}
		tempArray[size2 - 1] = value;

		return tempArray;

	}

	public static String[] insertValue(String[] arr, String value, int num) {
		int size = arr.length;
		int size2 = size + 1;
		String[] tempArray = new String[size2];
		tempArray[tempArray.length - 1] = arr[num];
		for (int i = 0; i < size; i++) {
			if (i == num) {
				tempArray[i] = value;
			} else {
				tempArray[i] = arr[i];
			}
		}
		return tempArray;
	}

}
