import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        String answer="";
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        for(int i=0;i<my_string.length();i++){
            set.add(my_string.charAt(i)+"");   
        }    
        
        for(String value : set) {
           answer+=value;
        }
        
        return answer;
    }
}