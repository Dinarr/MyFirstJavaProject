package constructors;

public class FaceBookUser {

	String username;
	String name;
	int age;
	String password;
	int numOfFriends;

	public FaceBookUser(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public FaceBookUser(String name, String username, String password) {
		this.name = name;
		this.username = username;
		if (password.contains(username)) {
			System.out.println("Password can't contain username. Please change password.");
			this.password = "";
		} else {
			this.password = password;
		}
	}

	public boolean sendFriendRequest(FaceBookUser user) {
		if (user.numOfFriends < 5000) {
			System.out.println("Friend request sent to " + user.name);
			user.numOfFriends++;
			this.numOfFriends++;
			return true;

		} else {
			System.out.println(user.name + " can't accept friend requests!");
			return false;
		}

	}
	public void userInfo() {
		System.out.println("\nFACEBOOK USER INFORMATION ");
		System.out.println("Name: " + this.name);
		System.out.println("Username: " + this.username);
		System.out.println("Age: " + this.age);
		System.out.println("Friends: " + this.numOfFriends);
	}

}
