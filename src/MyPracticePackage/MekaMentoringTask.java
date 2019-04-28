package MyPracticePackage;

public class MekaMentoringTask {

	public static void main(String[] args) {
		 
	}
	public static String mergeString(String one, String two) {
		String str = "";
		if(one.length() >= two.length()) {
			for(int i = 0; i < two.length(); i++) {
				str += one.charAt(i) + two.charAt(i) + "";
			}
			str += one.substring(two.length());
		} else if (one.length() <= two.length()){
			for(int i = 0; i < one.length(); i++){
				str += one.charAt(i) + two.charAt(i) + "";
			}
			str += two.substring(one.length());
			
		}
		else {
			for(int i = 0; i < one.length(); i++) {
				str += one.charAt(i) + "" + two.charAt(i) + "";
			}
		}
		return str;
		
		
		
		
		
		
		
		
	}
	
	
}
