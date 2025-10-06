import java.util.Scanner;

public class Main {
	static boolean visited[];
	static int N;
	static int M;
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		N=sc.nextInt();
		M=sc.nextInt();
		
		visited=new boolean[N+1];
		
		for (int i = 1; i <= N; i++) {
			String str=i+"";
			dfs(i,1,str);
		}
		
	}//main

	private static void dfs(int num, int count,String str) {
		if (count==M) {
			System.out.println(str);
			return ;
		}
		
		visited[num]=true;
		
		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				dfs(i,count+1,str+" "+i);
			}
		}
		
		visited[num]=false;
	}
	
}//class