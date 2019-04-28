package objectdatatypes;

public class PetShop {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		//dog - is a class that holds all the rules for one Dog to have;
		//dog1 - is a representation of an actual object/dog;
		//instance - same as object;
		//instantiate - creating an object/whenever we are using a key word 'new' we are 
		//instantiating an object;
		
		dog1.bark(); //simply calling the behavior method of Dog;
		dog1.age = 3;
		System.out.println("Age: " + dog1.age);
		dog1.color = "gray";
		System.out.println("Color: " + dog1.color);
	}
}
     