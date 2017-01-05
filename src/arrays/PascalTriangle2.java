package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class PascalTriangle2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalTriangle2 pt = new PascalTriangle2();
		Scanner in = new Scanner(System.in);
		int pascalNo = in.nextInt();
		pt.buildPascal(pascalNo);

	}
	
	private void buildPascal(int pascalNo) {
		List<List<Integer>> outerList = new ArrayList<List<Integer>>();
		for (int i = 0; i < pascalNo; i++) {
			List<Integer> innerList =new ArrayList<Integer>();
			innerList.add(1);
			for (int j = 1; j < i; j++) {
				
				List<Integer> innerList1 = new ArrayList<Integer>();
				innerList1 = outerList.get(i-1);
				innerList.add(j, innerList1.get(j-1) + innerList1.get(j));
			
			}
			if(i > 0) {
			innerList.add(1);
			}
			outerList.add(innerList);
		}
		Iterator<List<Integer>> it = outerList.iterator();
		while(it.hasNext()) {
			List<Integer> innerList = new ArrayList<Integer>();
			innerList = it.next();
			for(int i = 0; i < innerList.size(); i++) {
				System.out.print(innerList.get(i));
			}
			System.out.println("");
		}
	}
}
