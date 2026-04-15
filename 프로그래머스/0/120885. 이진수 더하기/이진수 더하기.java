class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        long num1 = Long.parseLong(bin1, 2);
        long num2 = Long.parseLong(bin2, 2);
        
        long sum=num1+num2;
        
        answer = Long.toBinaryString(sum);
        
        return answer;
    }
}