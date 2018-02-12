package arrays;

import java.util.ArrayList;
import java.util.List;

public class ContiSubProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,-2,45};
		System.out.println(maxProducts(nums));
	}
	
	private static int maxProducts(int[] nums) {
		if(nums.length == 0) return 0;
		if(nums.length == 1) return nums[0];
		int max = nums[0], min = nums[0], result = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int temp = max;
			max = Math.max(Math.max(max*nums[i], min*nums[i]), nums[i]);
			min = Math.min(Math.min(temp*nums[i], min*nums[i]), nums[i]);
			if(max > result) result = max;
		}
		return max;
	}

}
