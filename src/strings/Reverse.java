package strings;

import java.util.ArrayList;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "aA";
		int count = 0;
		StringBuilder strb = new StringBuilder();
		ArrayList<Character> ar = new ArrayList<>();
		for(int i = 0; i < s.length(); i++) {
			if(isVowel(s.charAt(i))) {
				ar.add(s.charAt(i));
				count++;
			}
		}
		for(int i = 0; i < s.length(); i++) {
			if(isVowel(s.charAt(i))) {
				strb.append(ar.get(--count));
			} else {
				strb.append(s.charAt(i));
			}
		}
		System.out.println(strb);
	}
	
	private static boolean isVowel(char a) {
		if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') return true;
		else return false;
	}
}


