package encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {

	ArrayList<User> friends; // = new ArrayList<>();
	ArrayList<Post> posts; // = new ArrayList<>();
	private String name;
	private String location;
	private int age;
	static ArrayList<User> allUsers = new ArrayList<>();

	public User(String name, int age) {
		this.name = name;
		this.setAge(age);
		this.friends = new ArrayList<>();
		this.posts = new ArrayList<>();
		allUsers.add(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 120) {
			this.age = age;
		} else {
			System.out.println("Please enter a valid age.");
		}

	}

	public void sendFriendRequest(User targetUser) {
		if (this.friends.size() < 10 && targetUser.friends.size() < 10) {
			targetUser.friends.add(this);
			this.friends.add(targetUser);
			System.out.println(targetUser.name + " is successfully added to the friends list!");
		} else {
			System.out.println("Maximum Friends limit is reached.");
		}
	}

	public static void seeTimeline(User user) {
//		for (int i = 0; i < user.posts.size(); i++) {
//			user.posts.get(i).info();
//		}
		for (Post p : user.posts) {
			p.info();
		}
	}

	public void info() { // not static because info belongs to only one object;
		System.out.println("\nUser Information");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Location: " + this.location);
		System.out.println("Number of posts: " + this.posts.size());
		System.out.println("Number of friends: " + this.friends.size() + "\n");

	}

	public void createPost(String postBody) {
		System.out.println(postBody + " is posted succesfully!");
		Post p = new Post(postBody);
		this.posts.add(p);
	}

	public static User creatProfile() {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to our WebSite!\n");
		System.out.println("Please enter your name: ");
		String name = input.nextLine();
		System.out.println("Please enter your age: ");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("Please enter your location: ");
		String location = input.nextLine();
		User user = new User(name, age);
		allUsers.add(user);
		user.setLocation(location);
		return user;

	}
	// Create a static method seeAllUsers. This method doesn’t accept
	// anything and it doesn’t
	// return anything. Method should print all the users of total users.

	public static void seeAllUsers() {
		for (User u : allUsers) {
			u.info();
		}

	}
	public static void search(int age1, int age2) {
		allUsers.get(age1);
		allUsers.get(age2);
	}
	public static void search(String location) {
		if(allUsers.contains(location)) {
			System.out.println(allUsers);
		}
	}

}
