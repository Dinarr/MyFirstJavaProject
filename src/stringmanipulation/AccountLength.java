package stringmanipulation;

public class AccountLength {

	public static void main(String[] args) {
		String s = "Account number: 255789AC";
		int firstIndex = s.indexOf(":") +2;
		String accountNumber = s.substring(firstIndex);
	if (accountNumber.length() == 8) {
		System.out.println("Valid account number length");
		
	} else {
		System.out.println("Invalid account number length");
	}
	}
}
