package MyPracticePackage;

import java.util.ArrayList;

public class AddArray {



	public String printList(ArrayList<ArrayList<String>> nestedList) {
		
		ArrayList<String> list = new ArrayList<>();
		nestedList.add(list);
		
		String var = nestedList.get(0).get(0);
		return var;

	}

}
