package inheritance;

public class Dog extends Animal {
	
	public static void animalStatic() {
		System.out.println("Static method in Dog class."); //its called a method hiding
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating.");
	}

	@Override
	public Dog getMother() {
		Dog d = new Dog();
		return d;

	}
}
