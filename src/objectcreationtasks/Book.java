package objectcreationtasks;

public class Book {

	// constructor; every time we create an object
	// it will be called separate for each object;
	// System.out.println("Constructor is here.");
    // we use this to access an instance variable;
	
	String title;
	String author;
	int pages;
	String language;

	public Book() {
		
	}
	public Book(String title) {
		this.title = title;
	}

}
