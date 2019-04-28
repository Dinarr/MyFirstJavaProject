package objectcreationtasks;

public class Books {
	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.title = "Zero to one";
		b1.author = "Black Masters";
		b1.pages = 150;

		Book b2 = new Book();
		b2.title = "10 x";
		b2.author = "Grand Cardone";
		b2.pages = 2000;

		Book b3 = new Book();
		b3.title = "Crime and punisment";
		b3.author = "Dostoevskii";
		b3.pages = 647;

		Book[] books = new Book[3];
		books [0] = b1;
		books [1] = b2;
		books [2] = b3;
		
		Student s1 = new Student();
		s1.name = "Diina John";
		s1.age = 45;
		s1.email = "diinajb@gmail.com";
		
		s1.read();
		s1.read(b2);
		
		
//		for (Book b: books) {
//			System.out.println(b.author);
//		}
	}

}
