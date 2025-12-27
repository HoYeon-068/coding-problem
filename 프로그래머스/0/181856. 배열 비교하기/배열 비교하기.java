class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        int sum_arr1=0;
        int sum_arr2=0;
        
        if(arr1.length>arr2.length)
            return 1;
        else if(arr1.length<arr2.length)
            return -1;
        else{
            for(int i=0;i<arr1.length;i++){
                sum_arr1+=arr1[i];
                sum_arr2+=arr2[i];
            }
            
            if(sum_arr1>sum_arr2)
                return 1;
            else if(sum_arr1<sum_arr2)
                return -1;
            else
                return 0;
        }
    }
}