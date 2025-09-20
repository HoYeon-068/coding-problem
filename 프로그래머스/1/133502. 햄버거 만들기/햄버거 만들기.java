class Solution {
    static String BURGER="1231";
    	 	 public static int solution(int[] ingredient) {
	        int answer = 0;
	        int index;
	        
	        StringBuilder sb=new StringBuilder();
	        for (int i = 0; i < ingredient.length; i++) {
	        	sb.append(ingredient[i]);
			}
	        
	        
	        while ((index=sb.indexOf(BURGER))!=-1) {
				sb.replace(index,index+BURGER.length(), "");
				answer++;
			}
	        
	        return answer;
	    }
}