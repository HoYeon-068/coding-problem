import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	static boolean visit[];
	static ArrayList<Integer> arr[];
	static boolean arrive=false;
	
	public static void main(String[] args) throws NumberFormatException, IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		
		visit=new boolean[N];
		arr=new ArrayList[N];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=new ArrayList<Integer>();
		}
		
		
		for (int i = 0; i < M; i++) {
			st=new StringTokenizer(br.readLine());
			
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			
			arr[s].add(e);
			arr[e].add(s);
			
		}
		
		
		for (int i = 0; i < N; i++) {
			dfs(i,1);
			if (arrive) {
				break;
			}
		}
		
		System.out.println(arrive?"1":"0");
		
	}//main

	private static void dfs(int num, int count) {
		
		
		if (count==5||arrive) {
			arrive=true;
			return ;
		}
		
		
		visit[num]=true;
		
		for (int i :arr[num]) {
			if (!visit[i]) {
				dfs(i,count+1);
			}
		}
		visit[num]=false;
	}
	
}//class