package strings;

public class RevVowels {
	public static void main(String[] args) {
		String input = "divyangdoshi";
		String out = reverseVow(input);
		System.out.println(out);
	}
	
	private static String reverseVow(String s) {
		if(s == null || s.length() == 0) return s;
		String vowels = "aeiouAEIOU";
		char[] chars = s.toCharArray();
		int start = 0;
		int end = chars.length - 1;
		while (start < end) {
			while (start < end && !vowels.contains(chars[start] + "")) {
				start++;
			}
			while (start < end && !vowels.contains(chars[end] + "")) {
				end--;
			}
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			start++;
			end--;
		}
		return new String(chars);
	}

}
