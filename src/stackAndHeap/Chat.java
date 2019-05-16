package stackAndHeap;

public class Chat {

	public static void main(String[] args) {
		Message m1 = new Message();
		m1.body = "Hey, How are you?";
		m1.date = "May 11, 2019";
		m1 = new Message();
		System.gc();
		System.out.println(m1.body);
	}
}
