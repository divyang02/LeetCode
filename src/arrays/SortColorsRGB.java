package arrays;

public class SortColorsRGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,2,1,1,1,2,0,1,2,0};
		sortColors(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	 private static void sortColors(int[] nums) {
	        int f = 0, i = 0;
	        while(i < nums.length && f < nums.length){
	            if(nums[f] != 0) {
	                i = f+1;
	                while(i < nums.length && nums[i] != 0) i++;
	                if(i < nums.length) swap(nums,f,i);
	                while(i < nums.length && nums[i] == 0) f++;
	                System.out.println(f + " " + i);
	            } else {
	                f++;
	                System.out.println(f);
	            }
	        }
	        
	        int s = f ; i = s;
	        while(i < nums.length && s < nums.length){
	            if(nums[s] != 1) {
	                i = s+1;
	                while(i < nums.length && nums[i] != 1) i++;
	                if(i < nums.length) swap(nums,s,i);
	                while(i < nums.length && nums[i] == 1) s++;
	                System.out.println(s + " " + i);
	            } else {
	                s++;
	            }
	        }
	        
	        int t = s ; i = t;
	        while(i < nums.length && t < nums.length){
	            if(nums[t] != 2) {
	                i = t+1;
	                while(i < nums.length && nums[i] != 2) i++;
	                if(i < nums.length) swap(nums,t,i);
	                while(i < nums.length && nums[i] == 2) t++;
	                System.out.println(t + " " + i);
	            } else {
	                t++;
	            }
	        }
	    }
	    
	    private static void swap(int nums[], int a, int b) {
	        int t = nums[a];
	        nums[a] = nums[b];
	        nums[b] = t;
	    }

}
