import java.util.stream.IntStream;
class Solution {
    public static double solution(int[] arr) {
	        
		 	double answer = 0;
	        
	        answer=IntStream.of(arr).average().getAsDouble();
	        
	        return answer;
	    }
}