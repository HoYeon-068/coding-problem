class Solution {
    public int solution(int n) {
		int count=0;
		
        long num=n;
        
		while(num!=1&&count<500) {
			
			if (num%2==0) {
				num/=2;
			}else {
				num=(num*3)+1;
			}
			count++;
			
		}
		
		
		if(num!=1)
			count=-1;
        
        
        return count;
    }
}