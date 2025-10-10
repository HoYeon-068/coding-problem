import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static int result=0;
	
	public static void main(String[] args){
	
		
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		PriorityQueue<Integer> plus=new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> minus=new PriorityQueue<Integer>();
		
		for (int i = 0; i < N; i++) {
			int now=sc.nextInt();
			
			if (now==1) {
				result+=now;
			}else {
				if (now>0) {
					plus.add(now);
				}else {
					minus.add(now);
				}
			}
			
			
			
		}
		
		while (plus.size()>1) {
			
			int a=plus.poll();
			int b=plus.poll();
			
			result+=a*b;
			
		}
		
		while (!plus.isEmpty()) {
			result+=plus.poll();
		}
		
		
		
		while (minus.size()>1) {
			int a=minus.poll();
			int b=minus.poll();
			
			result+=a*b;
		}
		
		while (!minus.isEmpty()) {
			result+=minus.poll();
		}
		
		System.out.println(result);
		
		
		
	}//main
	
}//class