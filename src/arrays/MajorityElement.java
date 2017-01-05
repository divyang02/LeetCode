package arrays;

public class MajorityElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		MajorityElement me = new MajorityElement();
		int nums[] = {2,3,3};
		me.majorityElement(nums);
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");

	}
	
	private void majorityElement(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int no = nums[i];
            int temp = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == no) {
                   temp++;
                }
            }
            if(temp >= (double)n/2) {
                System.out.println(no);
                break;
            }
        }
    }
}
