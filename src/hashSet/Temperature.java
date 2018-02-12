package hashSet;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp = {55,38,53,81,61,93,97,32,43,78};
		int[] dt = dailyTemperatures(temp);
		for(int i : dt) {
			System.out.print(i + " ");
		}
	}
	
	private static int[] dailyTemperatures(int[] temp) {
		int[] result = new int[temp.length];
        result[temp.length-1] = 0;
        for(int i = temp.length-2; i >= 0; i--) {
        	//System.out.println(i);
            if(temp[i] < temp[i+1]) result[i] = 1;
            else {
                if(result[i+1] == 0) result[i] = 0;
                else {
                    int j = i+1;
                    int sum = 0;
                    while(true) {
                        if(temp[j+result[j]] > temp[i]) break;
                        sum += result[j];
                        j = j + result[j];
                        System.out.println(i + " " + j);
                        if(j >= temp.length || (result[j] == 0 && temp[j] <= temp[i])) {
                            sum = -1;
                            break;
                        }
                    }
                    if(sum == -1) {
                        result[i] = 0;
                    
                    } else {
                        result[i] = result[j] + 1 + sum;
                    }
                }
            }
        }
        return result;
	}

}
