package inheritance;

public class Animal {

	private int age;
	protected String gender;
	String color;

	public static void animalStatic() {
		System.out.println("Static method for animal.");
	}
	public Animal getMother() {
		Animal a = new Animal();
		return a;
	}

	public void eat() {
		System.out.println("Animal is eating.");
	}
}
