class Solution {
   public static int solution(int[][] sizes) {
        
        int sizeBig,sizeSmall;
        
        int big=0,small=0;
        
        for (int i = 0; i < sizes.length; i++) {
			sizeBig=Math.max(sizes[i][0], sizes[i][1]);
			sizeSmall=Math.min(sizes[i][0], sizes[i][1]);
			
			if (big<sizeBig) big=sizeBig;
			if (small<sizeSmall) small=sizeSmall;
			
		}

        
        return big*small;
    }
}