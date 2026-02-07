class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String num=k+"";
        String temp;
        
        for(;i<=j;i++){
            temp=i+"";
            for(int a=0;a<temp.length();a++){
                String t=temp.charAt(a)+"";
                if(t.equals(num))
                    answer++;
            }
        }
        
        return answer;
    }
}