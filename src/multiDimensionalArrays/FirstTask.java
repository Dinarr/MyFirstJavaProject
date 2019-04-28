package multiDimensionalArrays;

public class FirstTask {

	public static void main(String[] args) {

		int[][] table = { { 12, 14, 16, 77, 59 }, { 11, 13, 15, 17, 19 }, { 21, 23, 25, 27, 29 },
				{ 31, 33, 35, 37, 39 } };
		for (int i = 0; i < table.length; i++) {
			for (int d = 0; d < table[i].length; d++) {
				System.out.print(table[i][d] + "   ");
		}
			System.out.println();
		}
		//if we put sum here we need to set it to 0 outside of the loop;
		/*int maxValue = 0;
		for (int[] t : table) {
			int sum = 0;
			for (int i : t) {
				sum += i;
			} 
			//System.out.println(sum);
			  if(sum > maxValue) {
				    maxValue = sum;                // System.out.print(i + " ");
			  }
                                                   // System.out.println();
		} //sum = 0;
        System.out.println(maxValue);
        */
	}
}
