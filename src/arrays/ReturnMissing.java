package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnMissing {
	public static void main(String[] args) {
		ReturnMissing rm = new ReturnMissing();
		int[] nums = {1,1,2,2};
		rm.findDisappearedNumbers(nums);
	}

	 private void findDisappearedNumbers(int[] nums) {
		 List<Integer> lt = new ArrayList<Integer>();
	     Arrays.sort(nums);
	     for (int i = 0; i < nums.length - 1; i++) {
	         if (nums[i+1] != nums[i] && nums[i+1] != nums[i] + 1) {
	             for (int j = 0; j < nums[i+1] - nums[i] - 1; j++) {
	                 lt.add(nums[i] + j + 1);
	             }
	         }
	     }
	     if (nums[nums.length-1] != nums.length) {
	         for (int i = 0; i < nums.length - nums[nums.length-1]; i++) {
	             lt.add(nums[nums.length - 1] + i + 1);
	         }
	     }
	   }

}
