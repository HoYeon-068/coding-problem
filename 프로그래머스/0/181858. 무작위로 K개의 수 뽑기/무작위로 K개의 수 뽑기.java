import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int k) {
         LinkedHashSet<Integer> hset=new LinkedHashSet<Integer>();
		 	
		    int[] answer = new int[k];
	        
		    for (int i = 0; i < arr.length; i++) {
				hset.add(arr[i]);
			}
		    
		    List<Integer> list=new ArrayList<Integer>(hset);
		    
		    for (int i = 0; i < k; i++) {
				if (i<list.size()) {
					answer[i]=list.get(i);
				}else {
					answer[i]=-1;
				}
			}
		    
		    return answer;
    }
}