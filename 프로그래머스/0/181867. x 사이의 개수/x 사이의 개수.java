class Solution {
    public int[] solution(String myString) {
        
        int num=0;
        
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i)=='x')
                num++;
            
        }
        
        
        int[] answer = new int[num+1];
        
        int count=0;
        int index=0;
        
        for(int j=0;j<myString.length();j++){
            if(myString.charAt(j)=='x'){
                answer[index++]=count;
                count=0;
            }else{
                count++;
            }
        }
        
        if(count>0)
            answer[index++]=count;
        
        return answer;
    }
}