package immutableAndMutable;

public class SB {

	public static void main(String[] args) {
		/*StringBuilder sb = new StringBuilder("James");
		System.out.println(sb);
		// methods:
		// method#1 append ->
		sb.append(" Bond ");
		System.out.println(sb);
		sb.append(7);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.delete(1, 3);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.insert(2, "Hello! ");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.replace(0, 4, "What's up");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.delete(3, 45); //when we put negative -45 it will give an error out 
		//of b/can't go back from 3 to negative */
		
		String s1 = "James";
		String s2 = "James"; // new String("James");it will be false
		System.out.println(s1 == s2);
		//StringBuilder sb = new StringBuilder(s1); //converting String into String builder const
		//String s = sb.toString(); //converting from stringBuilder to String
		//System.out.println(s);
	}

}
