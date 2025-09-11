class Solution {
    	public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int card1_count=0;
        int card2_count=0;
        
        for (int i = 0; i < goal.length; i++) {
        	
        	if (card1_count<cards1.length) {
        		if (goal[i].equals(cards1[card1_count])) {
    				card1_count++;
    				continue;
    			}
        		
			}
        	
        	if(card2_count<cards2.length){
        		if (goal[i].equals(cards2[card2_count])) {
    				card2_count++;
    				continue;
    			}
			}
        	
        	answer="No";
        	break;
        	
        	
        	
		}//for문
        
        return answer;
    }
}