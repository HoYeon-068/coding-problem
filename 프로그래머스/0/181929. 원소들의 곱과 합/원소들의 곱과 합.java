class Solution {
    public int solution(int[] num_list) {
        
        int x=1;
        int y=0;
        for(int i=0;i<num_list.length;i++){
            x*=num_list[i];
            y+=num_list[i];
        }
        y*=y;
        
        return x<y?1:0;
    }
}