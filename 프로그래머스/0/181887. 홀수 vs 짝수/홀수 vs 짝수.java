class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int o_sum=0;
        int l_sum=0;
        for(int i=0;i<num_list.length;i++){
            if(i%2==0)
                o_sum+=num_list[i];
            else
                l_sum+=num_list[i];
        }
        return o_sum>l_sum?o_sum:l_sum;
    }
}