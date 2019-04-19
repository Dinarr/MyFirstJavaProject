package nestedloop;

import java.util.Random;

public class UnicNumGener {

	public static void main(String[] args) {
		Random random = new Random();
		String result = "";
		//int count = 0;
		for(int i = 0; i < 6; i++) {
			int ii = random.nextInt(10);
			while(result.contains(ii+ "")) {
				ii = random.nextInt(10);
				// count++;
			}
			result += ii;
	}
		//System.out.println(count);
		System.out.println(result);
}
}
