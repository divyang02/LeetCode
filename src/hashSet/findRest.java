package hashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] l1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] l2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
		for(String s : findRestaurant(l1,l2)){ 
			System.out.println(s);
		}
	}
	
	private static String[] findRestaurant(String[] list1, String[] list2) {
		int least = Integer.MAX_VALUE;
        List<String> r = new ArrayList();
        Map<String, Integer> one = new HashMap();
        Map<String, Integer> two = new HashMap();
        int i = 0;
        for(String s : list1) {
            one.put(s,i++);
        }
        i = 0;
        for(String s : list2) {
            two.put(s,i++);
        }
        if(list1.length > list2.length) {
            //int sum = 0;
            for(int j = 0; j < list2.length; j++) {
                int sum= 0;
                sum += two.get(list2[j]);
                if(!one.containsKey(list2[j])) continue;
                sum += one.get(list2[j]);
                if(sum < least) {
                	least = sum;
                	r.clear();
                	r.add(list2[j]);
                }
                if(sum == least) {
                	r.add(list2[j]);
                }
            }
        } else {
        	for(int j = 0; j < list1.length; j++) {
                int sum= 0;
                sum += one.get(list1[j]);
                if(!two.containsKey(list1[j])) continue;
                sum += two.get(list1[j]);
                if(sum < least) {
                	least = sum;
                	r.clear();
                	r.add(list1[j]);
                }
                if(sum == least) {
                	r.add(list1[j]);
                }
            }
        }
        String[] result = new String[r.size()];
        result = r.toArray(result);
        return result;
	}

}
