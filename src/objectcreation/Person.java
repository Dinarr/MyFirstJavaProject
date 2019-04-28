package objectcreation;

public class Person {

	String name;
	int age;
	String gender;
	//name that is declared within the method called local variable.
	//name that is declared within the class called instance variable.
	
	public void talk() {
		String name = "Dina";
		System.out.println(this.name);
		System.out.println(this.gender);
	}
	
	
	
	
}
