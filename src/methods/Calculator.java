package methods;

public class Calculator {

	public static void main(String[] args) {
		int x = addition(2, 5);
		System.out.println(x);

		int y = substraction(5, 4);
		//System.out.println(addition(2, 5)); this way works too
		System.out.println(y);

		int d = division(10, 2);
		System.out.println(d);

		int e = multiplication(2, 5);
		System.out.println(e);

	}

	public static int addition(int num1, int num2) {
		return num1 + num2;
	}

	public static int addition(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	public static int substraction(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	public static int division(int num1, int num2) {
		return num1 / num2;
	}

}
