class Solution {
    public String solution(String my_string) {
        String answer = "";
       
        
        char[] arr= my_string.toCharArray();
        char temp;
        
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        
        for(int i=0;i<arr.length;i++){
            answer+=arr[i];
        }
        
         return answer;
    }
}