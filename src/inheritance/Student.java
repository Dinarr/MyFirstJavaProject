package inheritance;

public class Student {

	String name;
	int age;
	String location;
	String grade;

	public void study(String course) {
		System.out.println("Student stuying " + course + ".");
	}

	public void takeExam(int score) {
		if (score <= 100 && score <= 90) {
			this.grade = "A";
		} else if (score >= 80 && score < 90) {
			this.grade = "AB";
		} else if (score >= 70 && score < 80) {
			this.grade = "B";
		} else if (score >= 60 && score < 70) {
			this.grade = "C";
		} else if (score < 60) {
			this.grade = "F";
		} else {
			System.out.println("Please enter a valid score!");
		}

	}
}
