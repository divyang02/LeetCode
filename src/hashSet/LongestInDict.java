package hashSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestInDict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
		System.out.println(longestWord(arr));
		//System.out.println("1");
	}
	
	private static String longestWord(String arr[]) {
		Map<String, Integer> lw = new HashMap<>();
		String result = "";
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			lw.put(arr[i], arr[i].length());
		}
		for(int i = arr.length-1; i >= 0; i--) {
			if(arr[i].length() < result.length()) continue;
			for(int j = 1; j <= arr[i].length(); j++) {
				if(!lw.containsKey(arr[i].substring(0, j))) break;
				if(j == arr[i].length()) result = arr[i];
				
			}
		}
		return result;
	}

}
