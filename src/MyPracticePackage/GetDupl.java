package MyPracticePackage;

public class GetDupl {

	public static void main(String[] args) {
		String [] arr = {"1","2","aa","1", "1"};
		System.out.println(getDup(arr));

	}

	public static int getDup(String[] r) {
	    int counter = 0;
	    int index = 0;
	    String str = "";
	    for(int i = 0; i < r.length; i++){
	      counter = 0;
	    for(int d = 0; d < r.length; d++){
	      if(r[i].equalsIgnoreCase(r[d]) && !str.contains(r[i]) ){
	        counter++;
	      }
	    }
	    if(counter > 1){
	      index += counter;
	    }
	    str += r[i];
	    
	    }
	    
	   return index;
	   
	  }


}
