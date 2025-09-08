class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int min_bill=Math.min(bill[0], bill[1]);
        int max_bill=Math.max(bill[0], bill[1]);
        int min_wallet=Math.min(wallet[0], wallet[1]);
        int max_wallet=Math.max(wallet[0], wallet[1]);
        
        while (min_bill>min_wallet||max_bill>max_wallet) {
			if (bill[0]>bill[1]) {
				bill[0]/=2;
			}
			else {
				bill[1]/=2;
			}
			answer++;
			
			min_bill=Math.min(bill[0], bill[1]);
			max_bill=Math.max(bill[0], bill[1]);
			
		}
        
        return answer;
    }
}