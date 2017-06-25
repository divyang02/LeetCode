package strings;

public class RepeatedSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abaababaab";
		System.out.println(repeatedSubstringPattern(input));
	}
	
	private static boolean repeatedSubstringPattern(String s) {
		/**int length = s.length();
		int count = 1;
		int i = 1;
		while(i < length && s.charAt(0) != s.charAt(i)) {
			i++;
			count++;
		}
		if(count == length || length % count != 0) return false;
		else {
			String sub = s.substring(0, count);
			int j = count;
			int k = j + count;
			while(k <= length && s.substring(j, k).equals(sub)) {
				j = k;
				k = j + count;
			}
			if(j == length) return true;
			return false;
		}**/
		
		int length = s.length();
		int count = 1;
		while(count <= length / 2) {
			String sub = s.substring(0, count);
			int j = count;
			int k = j + count;
			while(k <= length && s.substring(j, k).equals(sub)) {
				j = k;
				k = j + count;
			}
			if(j == length) return true;
			count++;
		}
		return false;
	}

}
