import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        int answer = 0;
        int length=numbers.length;
        
        Arrays.sort(numbers);
        
        int num1=numbers[0]*numbers[1];
        int num2=numbers[length-1]*numbers[length-2];
        
        answer=Math.max(num1,num2);
        
        return answer;
    }
}