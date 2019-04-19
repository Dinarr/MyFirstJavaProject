package ifelsestatements;

	import java.util.Scanner;


	class Main{
	  public static void main(String[] args) {
	    int unitPrice;
	    int quantity;
	    double grandTotal=0.0;
	    int discount=0;
	    double discountApplied=0.0;
	    double total=0.0;
	    
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter unit price:");
	    unitPrice = input.nextInt();
	    
	    System.out.println("Enter quantity:");
	    quantity = input.nextInt();
	    
	    // your code here. (DO NOT change existing code)
	    //----------------------------------------------
	    grandTotal = unitPrice*quantity;
if (quantity > 120 ) {
	discount = 15;
}
if (quantity >=100 && quantity <= 120) {
	discount = 10;
	}
if (quantity < 100) {
	discount = 0;
}
discountApplied = (grandTotal*discount)/100;
total =grandTotal - discountApplied;
System.out.println("Grand Total: $ "+grandTotal);
System.out.println("Discount: $ "+discount);
System.out.println("Discount applied: $ "+discountApplied);
System.out.println("Total: $ : "+total);
     
     
     
   
 
	


	int price=0;
    int quarter=0;
    int dime = 0;
    int nickle=0;
  
    System.out.println("Enter price in cents:");
    price = input.nextInt();
    int change = 100-price;
    quarter = change/25;
    change = change%25;  //change %= 25
    dime = change/10;
    change = change%10;
    nickle = change/5;
    System.out.println("Your change is "+quarter+" quarters, "+dime+" dimes, and "+nickle+" nickels.");
    
    
    
	
    
	}
	}
    
    
    
    
    
