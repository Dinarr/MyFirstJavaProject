package encapsulation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*; //ArrayList;
					//import java.util.Date;
					//import java.util.Scanner;

public class Post {
	Scanner input = new Scanner(System.in);
	private ArrayList<String> comments; // = new Arraylist<>();
	private int likes;
	private String date;
	private String postBody;

	public Post(String postBody) {
		if (postBody.isEmpty()) {
			System.out.println("Post has no Body!");
		} else {
			this.postBody = postBody;
		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String dateStr = dateFormat.format(date);
		this.date = dateStr;
		comments = new ArrayList<>();

	}

	public ArrayList<String> getComments() {
		return comments;
	}

	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public String getDate() {
		return date;
	}

	public String getPostBody() {
		return postBody;
	}

	public void setPostBody(String postBody) {
		this.postBody = postBody;
	}

	public void info() {
		System.out.println("\nPost Information");
		System.out.println("Post body: " + this.postBody);
		System.out.println("Date: " + this.date);
		System.out.println("Likes: " + this.likes);
		System.out.println("Comments: ");
		int counter = 1;
		for (String com : comments) {
			System.out.println("Comment " + counter + ": " + com);
			counter++;
		}
	}

	public void editPost() {
		System.out.println("Please enter a new Post: ");
		this.postBody = input.nextLine();

	}

	public void deleteComment(String comment) {
		this.comments.remove(comment);

	}

	public void addComment(String comment) {
		if (comment.isEmpty()) {
			System.out.println("\nComment is empty.");
		} else {
			if (comment.contains("hell") || comment.contains("crap") || comment.contains("heck")) {
				System.err.println("\nComment contains bad words.");
			} else {
				this.comments.add(comment);
			}
		}
	}

	public void like() {
		this.likes++;
	}

	

}
