package methods;

import arrays.Search;

public class GoogleResultCount {

	public static void main(String[] args) {
		String result = "About 841,000,000 results (0.68 seconds)";
		String c = resultCount(result);
		System.out.println(c);
		String happiness = resultCount("About 11,690,000,000 results (0.70 seconds)");
		System.out.println(happiness);
		
		System.out.println(resultTime(result));
	}

	public static String resultCount(String res) {
		String[] words = res.split(" ");
		String s = words[1];
		s = s.replace(",", "");
		return s;

	}
	public static String resultTime(String res) {
		String r = res.substring(res.indexOf("(")+1, res.length()-1);
		return r;
	}

	
	

}
