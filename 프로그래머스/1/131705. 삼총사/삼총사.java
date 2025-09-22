class Solution {
    static int result=0;
	static int[] num;
    public static int solution(int[] number) {
        
        num=number;
        find(0,0,0);
        return result;
    }



	private static void find(int index,int arrIndex, int sum) {
		// TODO Auto-generated method stub
		
		if (index==3) {
			
			if (sum==0) {
				result++;
			}
			return;
		}
		
		if (arrIndex>=num.length) {
			return;
		}
		
		
		find(index+1,arrIndex+1,sum+num[arrIndex]);
		find(index,arrIndex+1,sum);
		
	}
}