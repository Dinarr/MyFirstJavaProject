package stringmanipulation;

public class CheckAccount {

	public static void main(String[] args) {
		String s = "Account number: 255789ACCD";
		int nIndex = s.indexOf(" ")+1;
        if (s.charAt(nIndex) == 'n'){
        	System.out.println("Starts with lower case");
        }
        else {
        	System.out.println("Starts with upper case");
		}
		
	}
}
