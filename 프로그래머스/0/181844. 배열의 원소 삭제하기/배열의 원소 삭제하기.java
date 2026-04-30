import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        
       answer=Arrays.stream(arr)
            .filter(s->{
                for(int i=0;i<delete_list.length;i++){
                    if(s==delete_list[i])
                        return false;
                }
                return true;
            })
            .toArray();
        
        return answer;
    }
}