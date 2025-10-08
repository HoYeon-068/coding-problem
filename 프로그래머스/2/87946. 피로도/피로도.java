class Solution {
    
    static int dungeons_[][];
	static boolean visited[];
	static int answer=0;
    
   public static int solution(int k, int[][] dungeons) {
       
        
        dungeons_=dungeons;
        visited=new boolean[dungeons.length];
        
        DFS(k,0);
        System.out.println(answer);
        return answer;
    }


	private static void DFS(int k,int index) {
		
		boolean isEnd=true;
		
		for (int i = 0; i < dungeons_.length; i++) {
			
			if (!visited[i]&&dungeons_[i][0]<=k) {
				
				visited[i]=true;
				isEnd=false;
				
				DFS(k-dungeons_[i][1],index+1);
				visited[i]=false;
			}
			
			
			
		}
		
		if (isEnd) {
			answer=Math.max(answer, index);
		}
		
	}
}