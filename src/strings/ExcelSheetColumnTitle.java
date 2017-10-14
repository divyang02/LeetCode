package strings;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "BBB";
		int count = 0;
		//char arr[] = s.toCharArray();
		for(int i = s.length() - 1; i >= 0; i--) {
			count += (Math.pow(26, ((s.length() - 1) - i)))*((int)s.charAt(i) - 64);
		}
		System.out.println(count);
	}

}
