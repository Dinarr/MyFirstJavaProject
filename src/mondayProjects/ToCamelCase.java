package mondayProjects;

public class ToCamelCase {

	public static void main(String[] args) {

	}

	public String camelCase(String in) {
		if (in == null)
			return null;

		StringBuilder cam = new StringBuilder(in.length());

		for (String word : in.split(" ")) {
			if (!word.isEmpty()) {
				cam.append(Character.toUpperCase(word.charAt(0)));
				cam.append(word.substring(1).toLowerCase());
			}
			if (!(cam.length() == in.length()))
				cam.append(" ");
		}

		return cam.toString();
	}
	

	
	
}

	
	
	
	
	
	
