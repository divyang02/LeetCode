package arrays;

import java.util.HashMap;
public class TwoSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum ts = new TwoSum();
		int[] nums = {3,2,4};
		int target = 6;
		ts.twoSum(nums,target);
	}
	
	private void twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		int[] index = new int[2];
		for (int i = 0; i < nums.length; i++) {
			hs.put(nums[i], i);
		}
		
		for (int i = 0; i < nums.length; i ++) {
			int diff = target - nums[i];
			if(hs.containsKey(diff) && hs.get(diff) != i) {
				index[0] = Math.min(i, hs.get(diff));
				index[1] = Math.max(i, hs.get(diff));
			}
		}
		for(int i = 0; i < 2; i++) {
			System.out.println(index[i]);
		}
	}
}
