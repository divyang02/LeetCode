package arrays;

public class MissingNumber2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumber2 mn = new MissingNumber2();
		int[] nums = {0,1,2,4};
		mn.missingNumber(nums);
		//System.out.println(total);

	}
	public int missingNumber(int[] nums) {
		int len = nums.length;
		int total = ((len) * (2 + len - 1) / 2);
		int sum = 0;
		for (int num : nums) {
			total -= num ;
		}
		System.out.println(total);
		return total;
	}
}
