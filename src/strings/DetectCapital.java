package strings;

public class DetectCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "bC";
		System.out.println(input.length());
		System.out.println(detectCapital(input));
	}
	
	private static boolean detectCapital(String word) {
		//return word.matches("[A-Z] | [a-z] | [A-Z][a-z] +");
		/**char[] chars = word.toCharArray();
		int i = 0;
		int end = chars.length;
		if(i == 0 && Character.isUpperCase(chars[i])) {
			i++;
			if(Character.isUpperCase(chars[i])) {
				i++;
				while(i < end) {
					if(Character.isLowerCase(chars[i])) break;
					else i++;
				}
			} else {
				i++;
				while(i < end) {
					if(Character.isUpperCase(chars[i])) break;
					else i++;
				}
			}
		}
		else if(i == 0 && Character.isLowerCase(chars[i])) {
			i++;
			while (i < end) {
				if(Character.isUpperCase(chars[i])) break;
				else i++;
			}
		}
		if(i == end ) {
			return true;
		} else {
			return false;
		}**/
		
		int numUpper = 0;
		for (int i = 0; i < word.length(); i++) {
			if(Character.isUpperCase(word.charAt(i))) numUpper++;
		}
		if(numUpper == 1) return Character.isUpperCase(word.charAt(0));
		return numUpper == 0 || numUpper == word.length();
	}

}
