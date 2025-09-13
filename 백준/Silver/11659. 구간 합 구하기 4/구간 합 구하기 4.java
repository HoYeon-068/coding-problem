import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(br.readLine());
		long arr[]=new long[n+1];
		for (int i = 1; i <= n; i++) {
			arr[i]=arr[i-1]+Integer.parseInt(st.nextToken());
		}
		
		
		
		for (int k = 0; k < m; k++) {
			st=new StringTokenizer(br.readLine());
			int i_=Integer.parseInt(st.nextToken());
			int j_=Integer.parseInt(st.nextToken());
			System.out.println(arr[j_]-arr[i_-1]);
			
		}
		
	}//main

}//class