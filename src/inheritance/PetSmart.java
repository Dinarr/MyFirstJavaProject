package inheritance;

public class PetSmart {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.color = "Black";
		dog.gender = "male";
		dog.eat();
		dog.animalStatic();
		Dog.animalStatic();
	}

}
