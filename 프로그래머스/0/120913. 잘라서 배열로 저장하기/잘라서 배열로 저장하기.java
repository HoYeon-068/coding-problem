class Solution {
    public String[] solution(String my_str, int n) {
        int t=my_str.length()%n==0?my_str.length()/n:(my_str.length()/n)+1;
        String[] answer = new String[t];
        
        for(int i=0;i<t;i++){
            answer[i]=my_str.substring(i*n,(i+1)*n>my_str.length()?my_str.length():(i+1)*n);
        }
            
        
        return answer;
    }
}