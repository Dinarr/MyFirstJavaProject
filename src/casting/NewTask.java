package casting;

public class NewTask {

	public static void main(String[] args) {
	 String smsMessage = "Sender:<Mike Smith>. From Number:[202-123-3456]."
	 		+ " Message:{I love programing and problem solving!}";
	String sender;
	String phoneNumber;
	String message;
	sender = smsMessage.substring(smsMessage.indexOf("<")+1);
	System.out.println(sender);
	phoneNumber = smsMessage.substring(smsMessage.indexOf("[")+1);
	System.out.println(phoneNumber);
	message = smsMessage.substring(smsMessage.indexOf("{"));
	System.out.println(smsMessage);
		
		
		
		
		
		
		
}
}
