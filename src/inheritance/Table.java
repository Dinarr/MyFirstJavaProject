package inheritance;

public class Table extends Object {

	public static void main(String[] args) {

		Table t1 = new Table();
		Animal a = new Animal();
		Dog d = new Dog();
		//d.age = 1;
		d.eat();
		d.gender = "female";

	}
}
