package casting;

public class SaturdayMentoring {

	public static void main(String[] args) {
//		
//		String str = "Cybertek";
//		String str1 = str.substring(2, 5).toUpperCase();
//	    System.out.println(str1);
//	  //System.out.println(str.substring(2, 5));
//		
//		String str2 = str.replace("ber", str1);
//		System.out.println(str2); 
		
//		String str1 = (str.charAt(4)+ "").toUpperCase();
//		String str2 = str.replace("r", str1);
//		String str3 = str.replace(str.charAt(4)+"", (str.charAt(4)+"").toUpperCase());
//		System.out.println(str2);
		
		String str = "Cybertek";
		String str3 = str.replace(str.charAt(4)+"",(str.charAt(4)+"").toUpperCase());
        String str4 = str.replace("r", "R");
		System.out.println(str3);
		
	}
}
