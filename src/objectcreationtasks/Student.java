package objectcreationtasks;

public class Student {

	String name;
	int age;
	String email;

	public void read() {
		System.out.println("Student " + name + " is reading!");

	}
	
	public void read(int hours) {
		System.out.println(this.name + " is reading for " + hours + " hours.");
	}

	public void read(Book newBook) {
		System.out.println(this.name + " is reading " + newBook.title + " by " + newBook.author + ".");

	}

}
