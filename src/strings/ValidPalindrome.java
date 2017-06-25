package strings;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "0P";
		System.out.println(isPalindrome(input));
	}
	
	/**private static boolean isPalindrome(String s) {
		String s1 = s.replaceAll("\\W", "").toLowerCase();
		StringBuilder sb = new StringBuilder(s1).reverse();
		if(sb.toString().equals(s1)) return true;
		else return false;
	}**/
	
	private static boolean isPalindrome(String s) {
		char[] a = s.toCharArray();
		int start = 0;
		int end = a.length - 1;
		while(start < end) {
			while(!Character.isLetterOrDigit(a[start])  || Character.isWhitespace(a[start])) {
				start++;
				System.out.println(start);
			}
			while(!Character.isLetterOrDigit(a[end])  || Character.isWhitespace(a[end])) {
				end--;
				System.out.println(end);
			}
			if(Character.isUpperCase(a[start])) {
				System.out.println(a[start]);
				a[start] = Character.toLowerCase(a[start]);
			}
			if(Character.isUpperCase(a[end])) {
				a[end] = Character.toLowerCase(a[end]);
			}
			if(a[start] != a[end]) return false;
			start++;
			end--;
		}
		return true;
	}

}
