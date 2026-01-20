class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a=intervals[0][1]-intervals[0][0]+1;
        int b=intervals[1][1]-intervals[1][0]+1;
        int[] answer = new int[a+b];
        int index=0;
        for(int i=intervals[0][0];i<=intervals[0][1];i++){
            answer[index++]=arr[i];
        }
        for(int j=intervals[1][0];j<=intervals[1][1];j++){
            answer[index++]=arr[j];
        }
        
        
        return answer;
    }
}