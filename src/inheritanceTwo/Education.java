package inheritanceTwo;

import inheritance.CodingBootcamp;
import inheritance.CybertekStudent;

public class Education {

	public static void main(String[] args) {
		CodingBootcamp cb = new CodingBootcamp();
		cb.name = "Cybertek";
		cb.address = "2700 S River Road";
		cb.type = "Campus";

		CybertekStudent cs = new CybertekStudent();
		//cs.name = "Dina";
		//cs.age = 25;
		cs.study("Java");

	}
}
