class Solution {
    boolean solution(String s) {
        
        s=s.toUpperCase();
        
        int sNum=0,yNum=0;
        
        
        for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='P') sNum++;
			else if(s.charAt(i)=='Y') yNum++;
			
		}//for
        
        return sNum==yNum?true:false;
    }
}