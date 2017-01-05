package arrays;

import java.util.Scanner;

public class RotateArray {
	public static void main(String[] args) {
	RotateArray ra = new RotateArray();
	Scanner in = new Scanner(System.in);
	long startTime = System.nanoTime();
	int k = in.nextInt();
	int nums[] = {1,2,3,4};
	ra.rotate(nums,k);
	long endTime = System.nanoTime();
	System.out.println("Took "+(endTime - startTime) + " ns");

}

private void rotate(int[] nums, int k) {
	k = k % nums.length;
	int rotated[] = new int[nums.length];
	for (int i = 0; i < nums.length; i++) {
		rotated[i] = nums[i];
		if (i < k) {
			nums[i] = nums[nums.length - (k - i)];
		}
	}
	for (int l = k; l < nums.length ; l++) {
		nums[l] = rotated[l - k];
	}
	for (int m =0; m < nums.length; m++) {
		System.out.print(nums[m]);
	}
}
}
