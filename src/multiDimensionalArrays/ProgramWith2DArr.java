package multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramWith2DArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String name = "Adam";
//		String [] n = new String [2];
//		n[0] = name;
//		String [][] nn = new String[2][];
//		nn[0] = n;
		System.out.println("Please enter a number of groups: ");
		int sizeOfGroup = sc.nextInt();
		sc.nextLine();
		String[][] groups = new String[sizeOfGroup][];
		for (int i = 0; i < groups.length; i++) {
			System.out.println("Please enter a number of students for group: " + (i + 1));
			int memberNum = sc.nextInt();
			sc.nextLine();
			String[] group = new String[memberNum];
			for (int d = 0; d < group.length; d++) {
				System.out.println("Enter name " + (d + 1) + ":");
				groups[i][d] = sc.nextLine();
			}
			groups[i] = group;

		}
		System.out.println(Arrays.deepToString(groups));
	}
}
