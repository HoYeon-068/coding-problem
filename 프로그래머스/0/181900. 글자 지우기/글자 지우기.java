import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
	        Arrays.sort(indices);
	        for (int i = 0,count=0; i < my_string.length(); i++) {
				if (i!=indices[count]) {
					answer+=my_string.charAt(i);
				}else {
					if (count<indices.length-1) 
					 count++;
				}
			}
	        return answer;
    }
}