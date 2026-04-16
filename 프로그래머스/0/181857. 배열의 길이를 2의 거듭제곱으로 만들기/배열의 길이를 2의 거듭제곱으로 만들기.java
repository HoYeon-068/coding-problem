class Solution {
    public int[] solution(int[] arr) {
        
        
        int count=0;
        
        
        
        while(arr.length>Math.pow(2, count)){
            count++;
        }
        
        int[] answer = new int[(int)Math.pow(2, count)];
        
        for(int i=0;i<arr.length;i++){
            answer[i]=arr[i];
        }
        
        for(int i=arr.length;i<answer.length;i++){
            answer[i]=0;
        }
        
        
        return answer;
    }
}