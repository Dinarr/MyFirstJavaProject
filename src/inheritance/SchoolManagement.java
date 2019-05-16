package inheritance;

public class SchoolManagement {
	
	public static void main(String[] args) {
		
		InClassStudent st = new InClassStudent();
		OnlineStudent st1 = new OnlineStudent();
		
		st.name = "Dinara";
		st1.name = "Maryam";
		st.age = 25;
		st1.age = 25;
		st.takeExam(90);
		System.out.println(st.grade);
		CybertekStudent cs = new CybertekStudent();
		cs.name = "Dina";
		cs.age = 25;
		cs.study("Java");
		
	}

}
