 package MyPracticePackage;

public class CoverMeString {

	public static void main(String[] args) {
		System.out.println(coverString("java methods", "me"));

	}

	public static String coverString(String main, String coverME) {
		if(main.contains(coverME)) {
			main = main.replace(coverME, "[" + coverME + "]");
			return main;
		}
		return main.replace(main, "[" + main + "]");
	}

}
