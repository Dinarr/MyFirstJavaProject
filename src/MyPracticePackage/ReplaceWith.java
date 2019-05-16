package MyPracticePackage;

public class ReplaceWith {

	public static void main(String[] args) {
		
	}
	public StringBuilder replaceWith(String[] r,String replace,String replaceWith) {
	   
	   StringBuilder sb = new StringBuilder();
	   for(int i = 0; i < r.length; i++) {
		   if(r[i].equals(replace)) {
			   sb.append(r[i]);
			   sb.replace(0, replace.length(), replaceWith);
			   
		   }
	   }
		
		
		
		return sb;
	  }
	
	
	
	
	
}
