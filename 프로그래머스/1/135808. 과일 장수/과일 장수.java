import java.util.Arrays;

class Solution {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        int length=score.length;
        
        Arrays.sort(score);
        
        
        
        for (int i = 0; i < length/2; i++) {
			int temp=score[0+i];
        	score[0+i]=score[(length-1)-i];
        	score[(length-1)-i]=temp;
		}
        
        for (int i = 0,index=m-1; i < length/m; i++,index+=m) {
			answer+=score[index];
		}
        
        
        return answer*m;
    }
}