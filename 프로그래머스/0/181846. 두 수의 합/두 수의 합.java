import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger abig=new BigInteger(a);
		BigInteger bbig=new BigInteger(b);
				
        String answer = abig.add(bbig).toString();
        return answer;
    }
}