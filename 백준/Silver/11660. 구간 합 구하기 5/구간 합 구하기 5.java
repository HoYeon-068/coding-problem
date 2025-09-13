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
		
		int arr[][]=new int[n+1][n+1];
		int s_arr[][]=new int[n+1][n+1];
		
		for (int i = 1; i <= n; i++) {
			st=new StringTokenizer(br.readLine());
			
			for (int j = 1; j <= n; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				s_arr[i][j]=s_arr[i-1][j]+s_arr[i][j-1]+arr[i][j]-s_arr[i-1][j-1];
			}
		}
		
		int x1,y1,x2,y2;
		
		
		
		for (int i = 0; i < m; i++) {
			st=new StringTokenizer(br.readLine());
			
			x1=Integer.parseInt(st.nextToken());
			y1=Integer.parseInt(st.nextToken());
			x2=Integer.parseInt(st.nextToken());
			y2=Integer.parseInt(st.nextToken());
			
			
			System.out.println(s_arr[x2][y2]-s_arr[x2][y1-1]-s_arr[x1-1][y2]+s_arr[x1-1][y1-1]);
		}
		
		
	}//main

}//class