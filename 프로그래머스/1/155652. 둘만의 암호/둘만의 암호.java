import java.util.ArrayList;

class Solution {
   public static String solution(String s, String skip, int index) {
	        
	        ArrayList<Character> list=new ArrayList<Character>();
	        
	        for (int i = 'a'; i <= 'z'; i++) {
				
	        	if (skip.contains(String.valueOf((char)i))) continue;
	        	
	        	list.add((char)i);
	        	
			}
	        
	        System.out.println(list);
	        
	        StringBuilder sb=new StringBuilder();
	        
	        for (int i = 0; i < s.length(); i++) {
				int plusNum=list.indexOf(s.charAt(i))+index;
				if (list.size()<=plusNum) {
					plusNum%=list.size();
				}
				sb.append(list.get(plusNum));
				
			}
	        System.out.println(sb);
	        
	        return sb.toString();
	    }
}