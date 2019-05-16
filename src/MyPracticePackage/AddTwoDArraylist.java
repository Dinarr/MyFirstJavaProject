package MyPracticePackage;

import java.util.ArrayList;

public class AddTwoDArraylist {

	public String printList(ArrayList<ArrayList<String>> nestedList) {

		ArrayList<ArrayList<String>> newList = new ArrayList<ArrayList<String>>();
		newList.add(new ArrayList<String>());
		int outerIndex = 0;
		int innerIndex = 0;
		for (int i = 0; i < newList.size(); i++) {
			newList.get(outerIndex).addAll(innerIndex, newList.get(i));
			innerIndex++;
		}

		return newList.toString();

	}
}
