package multiDimensionalArrays;

import java.util.Arrays;

public class TwoDimenArrays {

	public static void main(String[] args) {
		String[][] groups = new String[3][];

		String[] team3 = { "Adam", "Meka" };
		String[] team2 = { "Edward", "Bella", "Aksanchi", "Marvel", "Dinka" };
		String[] team1 = { "Dinus", "Bika", "Suarez", "Dani" };
		groups[0] = team1;
		groups[1] = team2;
		groups[2] = team3;
		System.out.println(groups[1][3]); // .charAt(2));
		System.out.println(groups[2][0]);
		System.out.println(groups[0][2]);

		System.out.println(Arrays.toString(groups[0])); //arrayOfarray;
		System.out.println(Arrays.toString(groups[1]));
		System.out.println(Arrays.toString(groups[2]));
		System.out.println();
		// System.out.println(groups.length);
		for (int i = 0; i < groups.length; i++) {
		   // System.out.println(Arrays.toString(groups[i]));
			//System.out.println(groups[i].length);
			for(int d = 0; d < groups[i].length; d++) {
				System.out.print(groups[i][d] + " ");
			}
			System.out.println();
               
		}
	}

}
