class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i=0;i<my_string.length();i++){
            char now=my_string.charAt(i);
            if(Character.isUpperCase(now)){
                answer[now-'A']++;
            }else{
                answer[now-'a'+26]++;
            }
        }
        
        return answer;
    }
}