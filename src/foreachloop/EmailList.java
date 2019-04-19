package foreachloop;

public class EmailList {

	public static void main(String[] args) {
		
		String [] emails = {"di.otonova@gmail.com", "ms.otonova@mail.ru", 
				            "edwbella@family.com", "bella@gmailcom", "dii.dina@gmail.com"};
		
		for ( String email: emails) {
			if (email.contains("@") && email.contains(".")){
				System.out.println(email);
				
			}
			
		}
		
		
		
		
	}
}
