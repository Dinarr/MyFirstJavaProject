package methodOverloading;

public class Over {

	public static void main(String[] args) {
		draw();
		draw(45);
		draw("Red");
		draw("Dina", "Meka");//what we give value arguments
	}

                            //this is param
	public static void draw(String color) {
		System.out.println("Drawing in " + color);
	}

	public static void draw(int size) {
		System.out.println("Drawing with size of " + size);
	}

	public static void draw() {
		System.out.println("Drawing something");
	}
	public static void draw(String name, String s) { //when we use two string we can now know it
		System.out.println( name +  " ** " + s + " In sha Allah future software engineers!!!");
	}
}
