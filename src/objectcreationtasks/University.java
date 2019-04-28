package objectcreationtasks;

public class University {

	public static void main(String[] args) {
		Book b1 = new Book("To kill a mockingbird");
		Book b2 = new Book("100$ Startup");
		System.out.println(b1.title);
		
		Book b3 = new Book();
	}
}
