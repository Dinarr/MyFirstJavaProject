package ArrayList;

import java.util.ArrayList;

public class Transportation {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		System.out.println(names.size());
		names.add("Dina");
		names.add("Aisu");
		System.out.println(names);
		System.out.println(names.size());
		names.add(1, "Zhan");
		System.out.println(names);
		System.out.println(names.get(1));
		String s = "Dinara";
		String s2 = names.get(1);
		System.out.println(names.contains("Dinara"));
		System.out.println(names.indexOf("Aisu"));
		names.remove("Dina");
		System.out.println(names);
		names.remove(1);
		System.out.println(names);
		names.add("Dina");
		names.add("Dina");
		System.out.println(names);
		System.out.println(names.indexOf("Dina"));
		names.remove("Dina");
		System.out.println(names);
		System.out.println(names.isEmpty());
		names.clear();
		System.out.println(names);
	}

}
