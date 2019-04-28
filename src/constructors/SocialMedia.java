package constructors;

public class SocialMedia {

	public static void main(String[] args) {
		FaceBookUser fb1 = new FaceBookUser("dinash_94", "Insurgent94");
		fb1.name = "James Bond";
		FaceBookUser fb2 = new FaceBookUser("dinish07", "Dini25");
		// System.out.println(fb1.password);
		// System.out.println(fb2.username);
		fb2.age = 27;
		fb2.name = "Edward Collin";
		fb2.numOfFriends = 4999;

		FaceBookUser fb3 = new FaceBookUser("Dina John", "dinash_94", "Dina_25");
		// System.out.println(fb3.name);
		// System.out.println(fb3.password);
		// System.out.println(fb3.numOfFriends);

		// boolean check = fb3.sendFriendRequest(fb2);
		// System.out.println(check);
		fb3.sendFriendRequest(fb2);
		System.out.println(fb3.numOfFriends);
		System.out.println(fb2.numOfFriends);
		fb2.userInfo();
		fb3.userInfo();
	}
}
