package MyPracticePackage;

import java.util.ArrayList;

public class MekaMent {


    public String blogDb(ArrayList<String[]> r,String id)  {
    	ArrayList<String[]> arr = r;
	    for(int i = 0; i < arr.size(); i++){
	      for(int j = 0; j < arr.get(i).length; j++){
	        if(arr.get(i)[j].equals(id)){
	         return arr.get(i)[1] + arr.get(i)[2];
	         
	        }
	      }
	    }
	     return null;
	   
	  }
}