import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        String regex="[a-z|A-Z]+";
		
		int sum=0;
		
		Object arr[]=
		
		Arrays.stream(my_string.split(regex))
		.filter(s->!s.isEmpty())
		.map(s->Integer.parseInt(s))
		.toArray();

		for (Object object : arr) {
			int num=(int)object;
			
			sum+=num;
		}
		
        
        return sum;
    }
}