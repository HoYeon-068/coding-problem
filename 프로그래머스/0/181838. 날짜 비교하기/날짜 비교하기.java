class Solution {
    public int solution(int[] date1, int[] date2) {
        String date_1=String.format("%04d%02d%02d", date1[0], date1[1], date1[2]);
        String date_2=String.format("%04d%02d%02d", date2[0], date2[1], date2[2]);
        
        int A=Integer.parseInt(date_1);
        int B=Integer.parseInt(date_2);
        
        if(A<B)
            return 1;
        else
            return 0;
        
    }
}