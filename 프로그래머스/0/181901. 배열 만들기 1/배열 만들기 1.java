class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        for(int i=k,count=0;i<=n;i+=k,count++){
            answer[count]=i;
        }
        return answer;
    }
}