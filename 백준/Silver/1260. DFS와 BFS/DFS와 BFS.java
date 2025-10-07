import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static ArrayList<Integer> []arr;
	static boolean visited[];
	static Queue<Integer> q=new LinkedList<Integer>();
//	static N;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N= Integer.parseInt(st.nextToken());
		int M= Integer.parseInt(st.nextToken());
		int V= Integer.parseInt(st.nextToken());
		
		arr=new ArrayList[N+1];
		visited=new boolean[N+1];
		
		for (int i = 1; i <= N; i++) {
			arr[i]=new ArrayList<Integer>();
		}
		
		
		for (int i = 0; i < M; i++) {
			st=new StringTokenizer(br.readLine());
			
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			
			arr[s].add(e);
			arr[e].add(s);
			
		}
		
		for (int i = 1; i <= N; i++) {
			Collections.sort(arr[i]);
		}
		
		
		DFS(V);
		System.out.println();
		Arrays.fill(visited, false);
		BFS(V);
		System.out.println();
		
		
		
	}//main

	private static void BFS(int v) {
		q.add(v);
		visited[v]=true;
		
		
		
		while (!q.isEmpty()) {
			
			int now= q.poll();
			System.out.print(now+" ");
			for (int i = 0; i < arr[now].size(); i++) {
				
				if (!visited[arr[now].get(i)]) {
					visited[arr[now].get(i)]=true;
					q.add(arr[now].get(i));
				}
					
				}
			}
			
		}
		
		

	private static void DFS(int v) {
		visited[v]=true;
		
		System.out.print(v+" ");
		
		for (int i = 0; i < arr[v].size(); i++) {
			if (!visited[arr[v].get(i)]) {
				DFS(arr[v].get(i));
				
			}
		}
		
		
		
	}
	
}//class