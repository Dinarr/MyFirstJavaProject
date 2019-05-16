package MyPracticePackage;

public class Carpet {

	  public double width,length,unitPrice,totalPrice;
	  public boolean isPersian;
	  
	  public Carpet() {
		this.totalPrice = (width + length); 
	    this.isPersian = false;
	    this.unitPrice = 0.0;
		 
	  }
	 
	  public Carpet(double width, double length, double unitPrice, boolean isPersian) {
		  this.width = width;
		  this.length = length;
		  this.unitPrice = unitPrice;
		  this.isPersian = isPersian;
		  this.totalPrice = (width + length) * 2;
		  if(isPersian) {
			  totalPrice += 200;
		  }
	  }
	
}
