package strings;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "12312392";
		String num2 = "23";
		String output = addNumbers(num1, num2);
		System.out.println(output);
	}
	
	private static String addNumbers(String num1, String num2) {
		char[] a1 = num1.toCharArray();
		char[] a2 = num2.toCharArray();
		String a3 = "";
		int i = a1.length - 1;
		int j = a2.length - 1;
		int carry = 0;
		if(i >= j) {
			while(j >= 0) {
				int i1 = Integer.parseInt(Character.toString(a1[i]));
				int j1 = Integer.parseInt(Character.toString(a2[j]));
				int sum = i1 + j1 + carry;
				if(sum > 9) {
					carry = sum/10;
					sum = sum%10;
				} else {
					carry = sum/10;
				}
				a3 += Integer.toString(sum);
				i--;
				j--;
			}
			while(i >= 0 || carry > 0) {
				if(i != -1) {
					int i1 = Integer.parseInt(Character.toString(a1[i]));
					int sum = i1 + carry;
					if(sum  > 9) {
						carry = sum/10;
						sum = sum %10;
					} else {
						carry = sum/10;
					}
					a3 += Integer.toString(sum);
					i--;
				} else {
					int sum = carry;
					a3 += Integer.toString(sum);
					carry = 0;
				}
			}
			StringBuilder sb = new StringBuilder(a3);
			return sb.reverse().toString();
		} 
		else {
			while(i >= 0) {
				int i1 = Integer.parseInt(Character.toString(a1[i]));
				int j1 = Integer.parseInt(Character.toString(a2[j]));
				int sum = i1 + j1 + carry;
				if(sum > 9) {
					carry = sum/10;
					sum = sum%10;
				} else {
					carry = sum/10;
				}
				a3 += Integer.toString(sum);
				i--;
				j--;
			}
			while(j >= 0 || carry > 0) {
				if(j != -1) {
					int i1 = Integer.parseInt(Character.toString(a2[j]));
					int sum = i1 + carry;
					if(sum  > 9) {
						carry = sum/10;
						sum = sum %10;
					} else {
						carry = sum/10;
					}
					a3 += Integer.toString(sum);
					j--;
				} else {
					int sum = carry;
					a3 += Integer.toString(sum);
					carry = 0;
				}
			}
			StringBuilder sb = new StringBuilder(a3);
			return sb.reverse().toString();
		}
		
	}

}
