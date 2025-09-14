class Solution {
    static int result=0;
	static int a,b;
	
    public int solution(int a, int b, int n) {
        this.a=a;
	    this.b=b;
	    
	    coke(n);
	    
	    return result;
    }
    public void coke(int n) {
		int remain=0;
		while (n!=0) {
			remain+=n%a;
			result+=n=(n/a)*b;
		}
		
		if (remain>=a) {
			coke(remain);
		}
		
	}
}