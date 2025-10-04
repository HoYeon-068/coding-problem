import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] arr=new int[N];
		
		int num=1;
		
		StringBuffer sb=new StringBuffer();
		boolean result=true;
		
		Stack<Integer> stack=new Stack<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			
			int su=arr[i];
			
			if (su>=num) {
				while (su>=num) {
					stack.push(num++);
					sb.append("+\n");
					
				}
				stack.pop();
				sb.append("-\n");
				
			} else {
				int n=stack.pop();
				
				if (n>su) {
					System.out.print("NO");	
					result=false;
					break;
				} else {
					sb.append("-\n");
				}
				
				
			}
			
		}//for
		
		if (result) {
			System.out.print(sb.delete(sb.length()-1, sb.length()));
		}
	}
	

}