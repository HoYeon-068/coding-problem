class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String snum=num+"";
        String sk=k+"";
        return snum.indexOf(sk)!=-1?snum.indexOf(sk)+1:snum.indexOf(sk);
    }
}