import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int map[][];
	static boolean visited[][];
	static int N;
	static int M;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		map=new int[N][M];
		visited=new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String line=br.readLine();
			
			for (int j = 0; j < M; j++) {
				map[i][j]=Integer.parseInt(line.substring(j, j+1));
				
			}
			
		}
		
		BFS();
		
		
	}//main

	private static void BFS() {
		Queue<Node_> q=new LinkedList<Node_>();
		int for_[]= {-1,1};
		
		visited[0][0]=true;
		q.add(new Node_(0,0,1));
		
		while (!q.isEmpty()) {
			
			Node_ now=q.poll();
			
			if (now.x==N-1&&now.y==M-1) {
				System.out.println(now.count);
				return ;
			}
			
			
			for (int i = 0; i < for_.length; i++) {
				int move=for_[i];
				
//				System.out.println((now.x+move)+" "+(now.y+move));
				
				if (now.x+move>=0&&now.x+move<N) {
					if (!visited[now.x+move][now.y]&&map[now.x+move][now.y]!=0) {
						visited[now.x+move][now.y]=true;
						q.add(new Node_(now.x+move,now.y,now.count+1));
					}
				}
				
				
				if (now.y+move>=0&&now.y+move<M) {
					if (!visited[now.x][now.y+move]&&map[now.x][now.y+move]!=0) {
						visited[now.x][now.y+move]=true;
						q.add(new Node_(now.x,now.y+move,now.count+1));
					}
				}
				
				
				
			}
			
			
		}
		
		
	}
	
	
	
	
}//class



class Node_{
	
	int x;
	int y;
	int count;
	
	
	public Node_(int x, int y, int count) {
		this.x = x;
		this.y = y;
		this.count = count;
	}
	
	
}