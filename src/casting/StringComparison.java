package casting;

public class StringComparison {

	public static void main(String[] args) {
		//String s = "zebra";
	//	String s2 = "banana";
		//int i = s.compareTo(s2);
		//System.out.println(i); // 97-98= -1; small/negat
		
		String garage = "Toyota, Nissan, Honda, BMW, Mazerati, Ford";
		garage = garage.toLowerCase();
		System.out.println(garage);
		if (garage.isEmpty()) {
			System.out.println("There are no cars");
		} else {
	
		if (garage.contains("toyota") || garage.contains("nissan")) {
			System.out.println("There are Japanese cars in garage");
		} else {
			System.out.println("No Japanese cars in garage");
		
			if (garage.contains("bmw")) {
				System.out.println("There is a german car in garage");
			} else { 
				System.out.println("No german cars"); }
			if (garage.contains("mazerati")) {
				System.out.println("There are italian cars");
			} else {
				System.out.println("no italian cars");
			}
				
		if (garage.contains("jaguar")) {
			System.out.println("there is a british car in garage");
		} else {
			System.out.println("there is no british car"); 	}	
		 
		 }
		}
		
		}
}
	
