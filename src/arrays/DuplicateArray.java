package arrays;

import java.util.Arrays;

public class DuplicateArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateArray ds = new DuplicateArray();
		int[] nums = {1,2,3,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,6};
		ds.containsDuplicate(nums);
	}
	private void containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		int a = 0;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == nums[i+1]) {
				System.out.println("contains duplicate");
				a++;
			} 
		}
		if (a == 0) {
			System.out.println("no duplicte");
		}
	}
}
