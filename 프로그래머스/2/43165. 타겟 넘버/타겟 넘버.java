class Solution {
    static int[] n;
	static int t;
	static int answer=0;
	public static void main(String[] args) {
		
		int[] numbers= {1, 1, 1, 1, 1};
		int target=3;
		solution(numbers,target);
		
	}
	public static int solution(int[] numbers, int target) {
        n=numbers;
        t=target;
        
        dfs(0,0);
        return answer;
    }
	
	private static void dfs(int index, int sum) {
		
		
		if (index==n.length) {
			if (sum==t) {
				answer++;
			}
			return;
		}
		
		dfs(index+1, sum+n[index]);
		dfs(index+1, sum-n[index]);
		
	}
}