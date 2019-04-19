package nestedloop;

public class Window {

	public static void main(String[] args) {
		myOuterLoop:
		for(int i = 0; i < 5; i++) {
			myInnerLoop:
			for(int j = 0; j < 10; j++) {
				if(j == 5) {
					continue myInnerLoop;
				}
				if(j == 7) {
					break myOuterLoop;
		
					}
				System.out.println(j);
				}
			}
		}
	}

