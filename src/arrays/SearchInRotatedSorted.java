package arrays;

public class SearchInRotatedSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,1,2,3,4};
		System.out.println(search(arr,1));
	}
	
	private static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
        int start = 0, end = nums.length-1;
        while(start <= end) {
            int mid = (end + start)/2;
            System.out.println(mid);
            if(nums[mid] == target) return mid;
            else if(nums[start] > nums[mid]) {
                if(nums[mid] > target && nums[mid] > nums[end]) start = mid + 1;
                else if(nums[mid] > target && nums[mid] < nums[end]) end = mid - 1;
                //else if(nums[mid] > target && nums[end])
                else if(nums[mid] < target && target >= nums[start]) end = mid - 1;
                else start = mid + 1;
            }
            else //nums[start] < nums[mid]
            {
                if(nums[mid] > target && target >= nums[start]) end = mid - 1;
                else if(nums[mid] > target && target < nums[start]) start = mid + 1;
                else start = mid + 1;
                //else end = mid - 1;
                //System.out.println(end + " " + start);
            }
        }
        return -1;
    }

}
