class Solution {
    
		public static int[] solution(int l, int r) {
		
		String result="";
		String binary="";
		int count=0;
		boolean isCount=false;
		int i=1;
		
		do {
			binary=Integer.toBinaryString(i);
			count=Integer.parseInt(binary)*5;
			i++;
			
			if (l<=count&&count<=r) {
				result+=count+",";
				isCount=true;
			}
			
		} while (count<=r);
		String[] temp=result.split(",");
		
		int[] answer;
		
		if (isCount) {
			answer=new int[temp.length];
			for (int j = 0; j < temp.length; j++) {
				answer[j]=Integer.parseInt(temp[j]);
			}
		} else {
			answer= new int[]{-1};
		}
		
		
		
		return answer;
	}
}