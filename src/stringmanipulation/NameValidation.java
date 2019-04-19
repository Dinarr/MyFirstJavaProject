package stringmanipulation;

public class NameValidation {

	public static void main(String[] args) {  // lawr ence name.contains(" ") case sensitive
		String name = "Lawrence";
		boolean check = name.contains("w"); //returns boolean type ans true/false;
	    System.out.println(check);
	    String str = "Apple Inc. is an American multinational technology company ";
	    boolean b = str.contains("technology");
	    System.out.println(b);
	    //string s = "is"; boolean b = str.contains(s);
	    
	}
}
