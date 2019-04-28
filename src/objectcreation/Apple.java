package objectcreation;

public class Apple {
	// instance variables; they belong to an object;
	// All below variables belong to an object.
	int size;
	String type;
	String color;
	String taste;
	 
	public void setValue(int size, String type, String color, String taste) {
		this.size = size;
		this.type = type;
		this.color = color;
		this.taste = taste;
	}

	public void info() {
		if (size != 0) {

			System.out.println("Size: " + size);
		}
		if (type != null) {
			System.out.println("Type: " + type);
		}
		if (color != null) {
			System.out.println("Color: " + color);
		}
		if (taste != null) {
			System.out.println("Taste: " + taste);
		}
	}
}