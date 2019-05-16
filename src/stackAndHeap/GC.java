package stackAndHeap;

import constructors.Item;

public class GC {

	public static void main(String[] args) {
		GC g = new GC();
		g = null;
		String s = new String ("James");
		String s2 = new String ("James");
		String s3 = new String ("James");
		s = null;
		s2 = null;
		s3 = null;
		Item keys = new Item("Key", 4.99);
		Item adapter = new Item("MacBook Adapter", 60.5);
		keys = adapter;
		keys = null;
		System.gc();
		System.out.println("End of Program");
		
	}
	@Override
	public void finalize() {
		System.out.println("Finalize custom method");
	}
}
