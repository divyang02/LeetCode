package strings;

import java.util.Scanner;

public class IntegerToWords {
	private final static String[] belowTen = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private final static String[] belowTwenty = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final static String[] belowHundred = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long num = in.nextLong();
		System.out.println(numberToWords(num));
	}
	
	private static String numberToWords(long num) {
		if(num == 0) return "Zero";
		else return helper(num);
	}
	
	private static String helper(long num) {
		String result = new String();
		if(num < 10) result = belowTen[(int)num];
		else if(num < 20) result = belowTwenty[(int) num - 10];
		else if(num < 100) result = belowHundred[(int) num/10] + " " + helper(num%10);
		else if(num < 1000) result = helper(num/100) + " Hundred " + helper(num%100);
		else if(num < 1000000) result = helper(num/1000) + " Thousand " + helper(num%1000);
		else if (num < 1000000000) result = helper(num/1000000) + " Million " +  helper(num % 1000000);
        else result = helper(num/1000000000) + " Billion " + helper(num % 1000000000);
        return result;
	}

}
