package stringmanipulation;

public class Prefix {

	public static void main(String[] args) {
		String weather = "Really good";
		boolean check = weather.startsWith("Really good"); //Really good
		System.out.println(check);
		boolean check2 = weather.endsWith("d");      // Really good
		System.out.println(check2);
		boolean b = weather.startsWith("ly", 4);
		System.out.println(b);
		
		String s = "Account number: 2755555BFJACCD";
		boolean checkAccount = s.startsWith("2", 16);
		System.out.println(checkAccount);
		if (checkAccount) {
			System.out.println("Cool");
		} else {
			System.out.println("Not cool");
		}
			
		
		
		
		
		
		
		
		
	}
}
