class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int[] num=new int[box.length];
        
        for(int i=0;i<box.length;i++){
            num[i]=box[i]/n;
        }
        
        return num[0]*num[1]*num[2];
    }
}