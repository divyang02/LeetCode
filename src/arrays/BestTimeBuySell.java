package arrays;

public class BestTimeBuySell {
	
	private void maxProfit(int[] nums) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length - 1; i++) {
			int currVal = nums[i];
			min = Math.min(min, currVal);
			max = Math.max(max, currVal-min);
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BestTimeBuySell bss = new BestTimeBuySell();
		int[] nums = {7,2,4,5,6,9,1,6,10,17,9,6,3};
		long startTime = System.nanoTime();
		bss.maxProfit(nums);
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
	}
}
