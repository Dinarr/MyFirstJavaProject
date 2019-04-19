package switchstatements;

import java.util.Scanner;

public class taskSwitch2 {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		double number1, number2, result = 0;
//		String operator;
//		boolean invalidOperator = false;
//		System.out.println("Please enter two double values: ");
//	number1 = input.nextDouble();
//	number2 = input.nextDouble();
//    System.out.println("Please, choose an operator below: \n*, /, +, -");
//    operator = input.next();
//	switch(operator) {
//	case "*":
//		result = number1 * number2;
//	break;
//	case "/":
//		result = number1 / number2;
//		break;
//	case "+":
//		result = number1 + number2;
//		break;
//	case "-":
//		result = number1 - number2;
//		break;
//		default:
//			System.out.println("Invalid operator. Please try again!");
//	  invalidOperator = true;
//	} 
//	
//	if (invalidOperator == false){
//		
//	
//		System.out.println("Result of " + number1 + " " + operator + " " + number2 + " is" + " " + result);
//	}
	
	boolean check;
	check=1==10;
	System.out.println(check);
	
	check = "str".equals("str");
	
	System.out.println(check);
	if(check) {
		System.out.println("Success");
	}
	
	
	
}
}