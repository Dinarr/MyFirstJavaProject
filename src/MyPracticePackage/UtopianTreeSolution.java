package MyPracticePackage;

public class UtopianTreeSolution {

	public static void main(String[] args) {

		
		int grows =1;
		int treeSize =0;

		for (int i =1;i <=10;i++) {


			if(i<4) {
				System.out.println("year " + (i)+" - growth " + grows + "cm");
				treeSize++;
				
			}else {
				System.out.println("year " + (i)+" - growth " + 2 + "cm");
				treeSize+=2;
			}
		
			System.out.println("tree size: " + treeSize + " cm " );
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	