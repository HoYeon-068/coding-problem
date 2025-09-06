class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        for(int i=0,s=start_num;i<answer.length;i++,s++){
            answer[i]=s;
        }
            
        return answer;
    }
}