import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>((o1,o2)->{
			int first_abs=Math.abs(o1);
			int second_abs=Math.abs(o2);
			
			if(first_abs==second_abs)
				return o1>o2?1:-1;
			else
				return first_abs-second_abs;
			
		});
		StringBuilder sb=new StringBuilder();
		
		int N=Integer.parseInt(br.readLine());
		
		int num;
		
		for (int i = 0; i < N; i++) {
			num=Integer.parseInt(br.readLine());
			
			if (num!=0) {
				pq.add(num);
			}else {
				if (!pq.isEmpty()) {
					sb.append(pq.poll()+"\n");
				}else {
					sb.append("0"+"\n");
				}
			}
			
		}
		
		System.out.println(sb.toString());
		
	}//main

}//class