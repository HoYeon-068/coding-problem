import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
		
		if(arr.length==1) {answer=new int[1]; answer[0]=-1; return answer; }
		else answer=new int[arr.length-1];
		
		int min=Arrays.stream(arr).min().getAsInt();
		
		for (int i = 0,index=0; i < arr.length; i++) {
			if (arr[i]==min) continue;
			answer[index++]=arr[i];
		}
		
		return answer;
    }
}