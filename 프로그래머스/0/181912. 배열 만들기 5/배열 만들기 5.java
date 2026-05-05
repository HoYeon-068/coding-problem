import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        List<Integer> list=new ArrayList<Integer>();
        
        
        for(int i=0;i<intStrs.length;i++){
            
            String numStr=intStrs[i].substring(s,s+l);
            
            int num=Integer.parseInt(numStr);
            
            if(k<num)
                list.add(num);
            
        }
        answer=list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}