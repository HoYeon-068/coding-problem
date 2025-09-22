import java.util.Arrays;
class Solution {
   public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        int indexs[]=new int[26];
        int index;
        
        Arrays.fill(indexs,-1);
        
        for (int i = 0; i < s.length(); i++) {
		   
        	index=(int)(s.charAt(i)-'a');
        	
        	answer[i]=indexs[index]==-1?-1:i-indexs[index];
        	indexs[index]=i;
		}
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}