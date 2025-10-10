import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Solution {
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> hmap=new HashMap<Integer, Integer>();
        
        for (int i = 0; i < tangerine.length; i++) {
			if (!hmap.containsKey(tangerine[i])) {
				hmap.put(tangerine[i], 1);
			}
			else {
				hmap.put(tangerine[i], hmap.get(tangerine[i])+1);
				
			}
		}
        
        
        Set<Entry<Integer, Integer>> se= hmap.entrySet();
        
        Iterator<Entry<Integer, Integer>> ir=se.iterator();
        
        ArrayList<Integer> alist=new ArrayList<Integer>();
        
        while (ir.hasNext()) {
			Entry<java.lang.Integer, java.lang.Integer> entry = (Entry<java.lang.Integer, java.lang.Integer>) ir
					.next();
			alist.add(entry.getValue());
		}
        
        Collections.sort(alist,Collections.reverseOrder());
        
        
        while (k>0) {
			k-=alist.get(answer++);
		}
        
        System.out.println(answer);
        
        return answer;
    }
}