package casting;

public class CharValue {

	public static void main(String[] args) {
		//char c = 'A';
		//System.out.println(c);
		//int i = c;
		//System.out.println(i);
		
	String years = "Published on Feb 12, 2022";
	int indexOfComma = years.indexOf(",");
	
    years = years.substring(indexOfComma+ 2);
    System.out.println(years);
   int year = Integer.valueOf(years);
   if (year <= 2019) {
	   System.out.println("Valid year");
   } else {
	   System.out.println("Invalid year");
   }
		
		
		
		
		
	}
}
