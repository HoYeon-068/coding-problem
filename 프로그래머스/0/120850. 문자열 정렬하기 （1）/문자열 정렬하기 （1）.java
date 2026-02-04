import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int index=0;
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i)>=48&&57>=my_string.charAt(i)){
                index++;
            }
        }
        
        int[] answer = new int[index];
        index=0;
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i)>=48&&57>=my_string.charAt(i)){
                answer[index++]=my_string.charAt(i)-48;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}