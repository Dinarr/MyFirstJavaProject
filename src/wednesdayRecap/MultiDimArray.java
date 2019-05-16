package wednesdayRecap;

public class MultiDimArray {
	
	public static void main(String[] args) {
		
		int [][] table = {
				           {14,22,34,45,25},
				           {55,62,73,85,39},
				           {56,10,11,12,13},
				           {43,32,25,34,32}
		                 };
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
