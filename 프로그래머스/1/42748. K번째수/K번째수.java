import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
       int[] answer = new int[commands.length];
	        for (int i = 0; i < commands.length; i++) {
	        	int i_=commands[i][0];
	        	int j_=commands[i][1];
				int temp[]=new int[j_-i_+1];
										
				for (int j = 0; j <j_-i_+1 ; j++) {
					temp[j]=array[i_+j-1];
				}
				Arrays.sort(temp);
				answer[i]=temp[commands[i][2]-1];
	        	
			}
	        
	        return answer;
    }
}