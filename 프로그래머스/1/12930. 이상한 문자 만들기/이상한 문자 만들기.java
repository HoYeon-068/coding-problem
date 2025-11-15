class Solution {
    public String solution(String s) {
        String answer = "";
        
        for(int i=0,j=0;i<s.length();i++,j++){
            char s_char=s.charAt(i);
            
            if (s_char==' ') {
				j=-1;
				answer+=" ";
			}else {
				answer+=j%2==0?Character.toUpperCase(s_char):Character.toLowerCase(s_char);
			}
            
        }
        
        return answer;
    }
}