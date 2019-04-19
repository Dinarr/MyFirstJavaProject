package MyPracticePackage;

public class MethodClass {

	public static void main(String[] args) {

		printOdd50();
		welcomePeople("Bella");
		welcomePeople("Edward");
		printOdd(45);

	}

	public static void printOdd50() {
		for (int i = 0; i < 50; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void welcomePeople(String name) {
		System.out.println("Welcome, " + name + "!");
		
	}

	public static void  printOdd(int limit) {
    for (int i = 0; i < limit; i++) {
    	if(i % 2 == 1) {
    		System.out.print(i + " ");
    	}
    }
    	System.out.println();
    }
     
     
}
