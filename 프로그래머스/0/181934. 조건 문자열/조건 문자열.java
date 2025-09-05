class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if (eq.equals("=")) {
			if (ineq.equals(">")) {
                System.out.println("1");
				return n>=m?1:0;
			} else {
                System.out.println("2");
				return n<=m?1:0;
			}
		}else{
			if (ineq.equals(">")) {
                System.out.println("3");
				return n>m?1:0;
			} else {
                System.out.println("4");
				return n<m?1:0;
			}

		}
    }
}