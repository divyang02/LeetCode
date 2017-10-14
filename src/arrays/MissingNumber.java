package arrays;

public class MissingNumber {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		int[] missingNo = new int[12];
		int[] numbers = {2,3,4,5,7};
		missingNo[0] = numbers[0];
		if (numbers.length != 1) {
			
			for (int i = 1; i < numbers.length; i++) {
				missingNo[i] = numbers[i];
				if (missingNo[i] != missingNo[i - 1] + 1) {
					System.out.println(missingNo[i] - 1);
					break;	
				}
			}	
			} else System.out.println("-1");
		}
}


//for (int i = 1; i < nums.length; i++) {
		
		//if (nums[i] != nums[i - 1] + 1) {
			//System.out.println(nums[i] - 1);
			//return(nums[i] - 1);
			//break;	
      //} 
  //} return -1;
 //}
//} 
//} 