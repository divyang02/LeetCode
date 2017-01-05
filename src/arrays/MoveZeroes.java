package arrays;


public class MoveZeroes {
	public static void main(String[] args) {
		MoveZeroes mz = new MoveZeroes();
		int[] nums = {2, 0, 0, 0,2,1};
		mz.moveZeroes1(nums);
	}
	
	    private void moveZeroes1(int[] nums) {
	    	int position = 0;
	    	for (int i = 0; i < nums.length; i++) {
	        	if (nums[i] != 0) {
	        		nums[position++] = nums[i];
	            }
	        }
	        for (int i = position; i < nums.length; i++) {
		        	nums[i] = 0;
		    }
	        	for (int i=0; i < nums.length; i++) {
	        		System.out.println(nums[i]);
	        	}
	    }
}
