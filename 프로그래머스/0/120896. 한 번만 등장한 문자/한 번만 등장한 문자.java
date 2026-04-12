class Solution {
    public String solution(String s) {
        String answer = "";
        
        int arr[]=new int[26];
        
        int num=0;
        
        for(int i=0;i<s.length();i++){
            num=(int)s.charAt(i)-97;
            
            arr[num]++;
        }
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==1)
                answer+=(char)(i+97);
        }
        
        return answer;
    }
}