package strings;

public class ReverseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcd";
		int key = 2;
		String output = reverseStr(input, key);
		System.out.println(output);
	}
	
	private static String reverseStr(String s, int k) {
		char[] a = s.toCharArray();
		int len = a.length;
		int i = 0;
		int l = k - 1;
		if(len - i >= 2*k) {
			//System.out.println("ajbajbk");
			while(len - i >= 2*k) {
				reverseElements(a,i,l);
				i += 2*k;
				l += 2*k;
			}
		} 
		if(len - i < 2*k && len - i >= k) {
			//System.out.println("sdjbckdsbckd");
			reverseElements(a, i, l);
			StringBuilder sb = new StringBuilder();
			sb.append(a);
			return sb.toString();
		}
		else if (len - i < k){
			reverseElements(a, i, len-1);
			StringBuilder sb = new StringBuilder();
			sb.append(a);
			return sb.toString();
		}
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		return sb.toString();
	}
	
	private static void reverseElements(char[] a, int i, int l) {
		int t1 = i;
		int t2 = l;
		while (t1 < t2) {
			char temp = a[t1];
			a[t1] = a[t2];
			a[t2] = temp;
			t1++;
			t2--;
		}
	}

}
