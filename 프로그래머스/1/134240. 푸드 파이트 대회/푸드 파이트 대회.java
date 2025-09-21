class Solution {
    public static String solution(int[] food) {
	        
		 StringBuilder sb=new StringBuilder();
	     StringBuilder answer=new StringBuilder();
	        
	        for (int i = 1,num; i < food.length; i++) {
				num=food[i]/2;
				for (int j = 0; j < num; j++) {
					sb.append(i);
				}
			}
	        
	        answer.append(sb);
	        answer.append("0");
	        answer.append(sb.reverse());
	        
	        
	        
	        return answer.toString();
	    }
}