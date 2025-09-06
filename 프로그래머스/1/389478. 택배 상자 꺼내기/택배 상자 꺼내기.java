class Solution {
    public int solution(int n, int w, int num) {
       int answer = 0;
		boolean sw=true;
		int findNumIndex_i=-1,findNumIndex_j=-1;

		int c=n%w==0?n/w:n/w+1;
		int[][] boxs=new int[c][w];

		
		int count=1;
		for (int i = 0; i < boxs.length; i++) {
			if (sw) {
				for (int j = 0; j < boxs[i].length; j++) {

					boxs[i][j]=count;
					if (count==num) {
						findNumIndex_i=i;
						findNumIndex_j=j;
					}  
					if (count==n) break;
					count++;
				}
			}else {
				for (int j = boxs[i].length-1; j >= 0; j--) {

					boxs[i][j]=count;
					if (count==num) {
						findNumIndex_i=i;
						findNumIndex_j=j;
					}  
                    if (count==n) break;
					count++;
				}
			}
//			System.out.println(Arrays.toString(boxs[i]));
			        	sw=!sw;


		}//상자 for문
		
//		System.out.printf("boxs[%d][%d]=%d\n",findNumIndex_i,findNumIndex_j,boxs[findNumIndex_i][findNumIndex_j]);
		
		//상자 꺼내기 코드
		for (int i = findNumIndex_i; i < boxs.length; i++) {
			if (boxs[i][findNumIndex_j]!=0) answer++;
		}
//		System.out.println(answer);
		
		return answer;
    }
}