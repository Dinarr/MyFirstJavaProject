package stackAndHeap;

public class Message {

	String body;
	String date;
	
	@Override
	public void finalize() {
		System.out.println("Message: " + this.body);
		System.out.println("Date: " + this.date);
		System.out.println("is stored in the backup system!");
	}
	
}
