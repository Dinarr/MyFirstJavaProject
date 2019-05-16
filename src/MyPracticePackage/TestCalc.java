package MyPracticePackage;

import java.util.ArrayList;
import java.util.Collections;

public class TestCalc {

	public static void main(String[] args) {
//
//		Calculator a = new Calculator();
//		a.setX(1);
//		a.setY(1);
//		a.plus();
//		System.out.println("1+1 = " + a.getResult());// 1+1 = 2
		AddTwoDArraylist m = new AddTwoDArraylist();
	    ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
	    arr.add(new ArrayList<String>());
	    arr.add(new ArrayList<String>());
	    String[] strs = new String[]{"a","a","b"};
	    Collections.addAll(arr.get(0),strs);
	    
	    strs = new String[]{"z","z","z"};
	    Collections.addAll(arr.get(1),strs);
	    
	    
	    System.out.print(m.printList(arr));
	   
		
		

	}
}
