package stringmanipulation;

public class PrintAccoutNumber {

	public static void main(String[] args) {
		String s = "Your account number: 2755555BFJACCD";
		int firstIndex = s.indexOf(":") +2;
		char firstDigit = s.charAt(firstIndex);
		String account;
		if(firstDigit == '2') {
			account = s.substring(firstIndex, firstIndex + 6);	
		} else {
			account = s.substring(firstIndex, firstIndex + 5);
		}
		System.out.println("Account: " + account);
	}
}
