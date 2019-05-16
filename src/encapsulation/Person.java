package encapsulation;

public class Person {

	private String name;
	private String gender;
	private int age;
	private double height;
	private double weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String isGender() {
		return gender;
	}

	public void setGender(String gender) {
		if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male")) {
			this.gender = gender;
		} else {
			System.out.println("Please set a valid gender");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		if (age >= 0 && age <= 120) {
			this.age = age;
		} else {
			System.out.println("Invalid age!");
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height > 0) {
			this.height = height;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight > 0) {
			this.weight = weight;
		}
	}

	public void info() {
		System.out.println("\nPersonal Information");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Gender: " + this.gender);
		System.out.println("Height: " + this.height);
		System.out.println("Weight: " + this.weight);
	}

	public static void getHaircut(Person person) {
		if (person.gender.equalsIgnoreCase("female")) {
			System.out.println(person.name + " is getting haircut at Woman's Hair Saloon.");
		} else if (person.gender.equalsIgnoreCase("male")) {
			System.out.println(person.name + " is getting haircut at Men's Barbershop.");
		} else {
			System.out.println("Not able to get a haircut.");
		}
	}

	public static void getMarried(Person person1, Person person2) {
		if (person1.age >= 18 && person2.age >= 18) {
			if (person1.gender.equalsIgnoreCase("female") && person2.gender.equalsIgnoreCase("male")) {
				System.out.println("Valid Marriage!");
			} else if (person1.gender.equalsIgnoreCase("male") && person2.gender.equalsIgnoreCase("female")) {
				System.out.println("Valid Marriage!");
			} else {
				System.out.println("Invalid marriage!");
			}
		} else {
			System.out.println("Too young to get married.");
		}

	}
}
