import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int temp;
		int []tm;
        if (num_list[num_list.length-1]>num_list[num_list.length-2]) {
        	temp=num_list[num_list.length-1]-num_list[num_list.length-2];
			tm= Arrays.copyOf(num_list,num_list.length+1);
        	tm[tm.length-1]=temp;
        	return tm;
		}
        else {
        	temp=num_list[num_list.length-1]*2;
        	tm= Arrays.copyOf(num_list, num_list.length+1);
        	tm[tm.length-1]=temp;
        	return tm;
        }
    }
}