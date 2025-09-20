import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
   public static String solution(String[] survey, int[] choices) {
        
		String answer = "";
		String p="RTCFJMAN";
		
		Map<Character, Integer> hmap=new LinkedHashMap<Character, Integer>();
        
		for (int i = 0; i < p.length(); i++) {
			
			hmap.put(p.charAt(i), 0);
		}
		
		
		for (int i = 0; i < survey.length; i++) {
			char c;
			if (choices[i]<4) {
				c= survey[i].charAt(0);
				
				hmap.put(c, hmap.get(c)+(4-choices[i]));
				
			}else {
				c=survey[i].charAt(1);
				
				hmap.put(c, hmap.get(c)+(choices[i]-4));
			}
		}
		System.out.println(hmap);
        
		for (int i = 0; i < p.length(); i+=2) {
			if (hmap.get(p.charAt(i)) < hmap.get(p.charAt(i+1))) {
				answer+=p.charAt(i+1);
			}
			else {
				answer+=p.charAt(i);
			}
		}
		
        return answer;
    }
}