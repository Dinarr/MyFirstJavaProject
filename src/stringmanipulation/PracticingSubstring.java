package stringmanipulation;


public class PracticingSubstring {
	
      public static void main(String[] args) {
	//String accountNum1 = "Your account number: 257389ACCD";
	String accountNum1 = "Account number: 255789ACCD";
	//substring(i)+2);
	int indexOfFirstDigit = accountNum1.indexOf(":") + 2;
	System.out.println(indexOfFirstDigit);
	
	if (accountNum1.charAt(indexOfFirstDigit) == '2') {
		System.out.println("Cool!");
	}
	else {
		System.out.println("Not cool.");
	}
  
    	   
    	   
    	   
    	   
    	   
    	   
    	   
}
}
