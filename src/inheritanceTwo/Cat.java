package inheritanceTwo;

import inheritance.Animal;
import inheritance.Dog;

public class Cat extends Animal {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.gender = "male"; // its coming because protected and cat is a child class for Animal
		// Animal a = new Animal();
		// a.gender will not work because new created object is not a child class for
		// Animal.
		// c.color its ac.md is default and not giving access from different package.
		Dog d = new Dog();
		d.eat();

	}
}
