import java.util.Scanner;
import java.util.stream.IntStream;

class Solution {
    public int solution(int left, int right) {

		
		int sum=
		
		IntStream
		.rangeClosed(left, right)
		.map(s->{
						
			int count=0;
			for (int i = 1; i <= s; i++) {
				if (s%i==0) 
					count++;
			}
			
			return count%2==0?s:-s;
		})
		.sum();
        
		return sum;
    }
}