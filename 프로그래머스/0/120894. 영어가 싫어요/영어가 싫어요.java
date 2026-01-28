class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String[] number_arr={"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        
        for(int i=0;i<number_arr.length;i++){
            String temp_num=i+"";
            numbers=numbers.replaceAll(number_arr[i],temp_num);
        }
        
        answer=Long.parseLong(numbers);
        
        return answer;
    }
}