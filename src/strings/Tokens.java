package strings;

import java.util.StringTokenizer;

public class Tokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "ell0 koakbk";
		System.out.println(countSegments(input));
	}
	
	private static int countSegments(String s) {
		int count = 0;
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			count++;
			st.nextToken();
		}
		return count;
	}

}
