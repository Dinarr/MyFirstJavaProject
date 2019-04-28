package objectcreationtasks;

public class StudentCheck {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Dina John";
		s1.age = 25;
		s1.email = "dinajb@gmail.com";

		s1.read();
		Book b = new Book();
		b.title = "Zero to one";
		b.author = "Black Masters";
		b.pages = 350;
		s1.read(b);
		s1.read(2);
		
	}

}
