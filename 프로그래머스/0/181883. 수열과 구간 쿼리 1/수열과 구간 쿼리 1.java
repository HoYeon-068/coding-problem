class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        
        for(int i=0;i<queries.length;i++){
            int a=queries[i][0];
            int b=queries[i][1];
            
            for(int j=0;j<arr.length;j++){
                if(j>=a&&j<=b)
                    arr[j]++;
            }
        }
        
        return arr;
    }
}