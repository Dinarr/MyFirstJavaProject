package encapsulation;

public class SM {
	public static void main(String[] args) {

//		Post p1 = new Post("Love is a magic...");
//		p1.info();
//		p1.like();
//		p1.like();
//		p1.addComment("Love you");
//		p1.info();
//		p1.addComment("What the heck!");
//		p1.info();
//		
		//User dina = new User("Dina John", 25);
		//User meka = new User("Meka Noor", 28);
		// System.out.println(dina.friends.size());
//		dina.info();
		//dina.sendFriendRequest(meka);
//		System.out.println(dina.friends.size()); // .get(0).getName());
		// System.out.println(meka.friends.size());
//		dina.info();
//		dina.createPost("What a come back!");
//		dina.info();
//		dina.createPost("Today is a Great day!!!");
//		User.seeTimeline(dina);
//		meka.createPost("Love is in the air...");
//		meka.createPost("No Java, no Life...");
//		meka.createPost("Positive!");
//		User.seeTimeline(meka);
		User dinar = User.creatProfile();
		User dina = new User("Dina J", 25);
		User.seeAllUsers();
		

	}

}
