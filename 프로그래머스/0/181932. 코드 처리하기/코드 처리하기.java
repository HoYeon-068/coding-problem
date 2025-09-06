class Solution {
    public static String solution(String code) {
        String answer = "";
        boolean sw=false;
        for(int i=0;i<code.length();i++){
        	if (code.charAt(i)=='1') {
        		sw=!sw;
        		continue;
        	}
            if (!sw) {
				answer+=i%2==0?code.charAt(i):"";
			} else {
				answer+=i%2!=0?code.charAt(i):"";
			}
        }
        return answer.length()==0?"EMPTY":answer;
    }
}