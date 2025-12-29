class Solution {
    public int solution(int n) {
        int answer = 0;
        int k=1;
        
        while(k*k<=n&&k*k<=1000000){
            if(k*k++==n)
            return 1;
        }
        
        return 2;
    }
}