class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        int dot_1=dot[0];
        int dot_2=dot[1];
        
        if(dot_1>0&&dot_2>0)
            answer=1;
        else if(dot_1>0&&dot_2<0)
            answer=4;
        else if(dot_1<0&&dot_2<0)
            answer=3;
        else
            answer=2;
        
        return answer;
    }
}