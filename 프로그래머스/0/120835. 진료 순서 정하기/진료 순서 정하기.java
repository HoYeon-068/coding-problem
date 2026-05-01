class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i=0;i<emergency.length;i++){
            int cur=emergency[i];
            
            for(int j=0;j<answer.length;j++){
                if(cur>=emergency[j])
                    answer[j]++;
            }
        }
        
        return answer;
    }
}