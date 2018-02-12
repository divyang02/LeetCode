package hashSet;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class AnargamMapings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,12, 28, 46, 32, 50};
		int b[] = {50, 12, 32, 46, 28,12};
		int c[] = anar(a,b);
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i] + " ");
		}
	}
	
	private static int[] anar(int[] a, int[] b) {
		Map<Integer, Stack<Integer>> am = new HashMap<>();
		for(int i = 0; i < b.length; i++) {
			if(!am.containsKey(b[i])) {
				Stack<Integer> temp = new Stack<>();
				temp.push(i);
				am.put(b[i], temp);
			} else {
				am.get(b[i]).push(i);
			}
		}
		int temp[] = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			temp[i] = am.get(a[i]).pop();
		}
		return temp;
	}

}
