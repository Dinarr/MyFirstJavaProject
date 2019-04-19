package nestedloop;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Multiplication table: ");
		int result = 0;
		outerLoop:
		for (int i = 1; i <= 10; i++) {
			System.out.println("-------------");
		innerLoop:
		for (int b = 1;  b <= 10; b++) {
			result = i * b;
			System.out.println(i + "x" + b + "=" + result);
		}
		}
		
		
		
		
		
	}
}
