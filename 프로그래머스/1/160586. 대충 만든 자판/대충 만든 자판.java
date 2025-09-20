import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public static int[] solution(String[] keymap, String[] targets) {
	        Set<Character>ls=new LinkedHashSet<>();
	        
	        for (int i = 0; i < targets.length; i++) {
				for (int j = 0; j < targets[i].length(); j++) {
					ls.add(targets[i].charAt(j));
				}
			}
	        
	        Map<Character, Integer> hmap=new LinkedHashMap<Character, Integer>();
	        
	        Iterator<Character> ir =ls.iterator();
		 	while (ir.hasNext()) {
				Character c = (Character) ir.next();
				
				int min=-1;
				
				for (int i = 0; i < keymap.length; i++) {
					for (int j = 0; j < keymap[i].length(); j++) {
						
						if (keymap[i].charAt(j)==c) {
							
							if (min==-1||min>j+1) {
								min=j+1;
							}
							break;
						}
					}//for
				}//for
				
				
				hmap.put(c, min);
				
				
			}//while
		 	int[] answer = new int[targets.length];
		 	
		 	for (int i = 0; i < targets.length; i++) {
				int sum=0;
		 		for (int j = 0; j < targets[i].length(); j++) {
					if (hmap.get(targets[i].charAt(j))==-1) {
						sum=-1;
						break;
					}
					else {
						sum+=hmap.get(targets[i].charAt(j));
					}
				}
		 		answer[i]=sum;
			}
		 	
		 	
		 
	        
	        
	        
	        return answer;
	    }
}