
class Solution {
    public int[] solution(int n) {
       String num=n+",";
        
        while(n!=1){
            if(n%2==0)
                n/=2;
            else
                n=3*n+1;
            num+=n+",";
        }
        String[] temp=num.split(",");
        int[] answer=new int[temp.length];
        for (int i = 0; i < answer.length; i++) {
			answer[i]=Integer.parseInt(temp[i]);
		}
        
        return answer;
    }
}