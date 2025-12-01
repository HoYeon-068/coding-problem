class Solution {
    public int solution(int order) {
        int answer = 0;
        String o=order+"";
        
        for(int i=0;i<o.length();i++){
            if(o.charAt(i)=='3'||o.charAt(i)=='6'||o.charAt(i)=='9'){
                answer++;
            }
        }
        
        
        return answer;
    }
}