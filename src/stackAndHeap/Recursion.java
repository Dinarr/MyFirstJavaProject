package stackAndHeap;

public class Recursion {

	public static void main(String[] args) {
		// hi(); //when we call it will cause stackOverFlow recursion
		String s1 = new String("James"); //these two have they're stored separately in a heap
		String s2 = new String("James");
		String s3 = "James"; //when we create in this way/ we will use from String pool
		String s4 = "James"; //s3 s4 stored in a pool. 
		System.out.println(s1.hashCode()); // representation of new object in a memory
		System.out.println(s2.hashCode());
	}

	public static void hi() {
		System.out.println("Hi!");
		hi(); // method will print Hi infinitely.
	}
}
