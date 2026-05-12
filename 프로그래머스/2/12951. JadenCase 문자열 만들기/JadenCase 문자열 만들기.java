class Solution {
    public String solution(String s) {
        
        
        String changedString="";
		
		Boolean isFirst=true; 
		
		for (int i = 0; i < s.length(); i++) {
			
			char currentChar=s.charAt(i);
			
			currentChar=s.charAt(i);
			
			
			if (currentChar==' ') {
				isFirst=true;
				changedString+=currentChar;
			}else {
				if (isFirst) {
					changedString+=Character.toUpperCase(currentChar);
					isFirst=false;
				}else {
					changedString+=Character.toLowerCase(currentChar);
				}
			}
			
			
			
			}
        
        
        
        return changedString;
    }
}