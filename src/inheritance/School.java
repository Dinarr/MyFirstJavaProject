package inheritance;

public class School {

	public String name;
	public String address;
	public String type;

	public void giveHW() {
		System.out.println(this.name + " is giving a home work!");
	}

	public void hostEvent(String date) {
		System.out.println("Hosting an event on " + date);
	}
}
