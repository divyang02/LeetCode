package strings;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " ";
		System.out.println(reverseWords(s));
		if(s.equals(reverseWords(s))) System.out.println("yess");
		else System.out.println("noo");
	}
	
	public static String reverseWords(String s) {
        //if(s == null || s.length() == 1 || s.equals(" ")) {
        	//System.out.println("dbkbskb\n");
        	//return s;
        //}
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < s.length()) {
            if(s.charAt(i) == ' ') {
                i++;
            }
            else {
                String temp = "";
                while(i < s.length() && s.charAt(i) != ' ') {
                    temp += s.charAt(i);
                    i++;
                }
                temp += " ";
                sb.insert(0,temp);
            }
        }
        return sb.toString().trim();
    }

}
