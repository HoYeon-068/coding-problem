import java.util.Scanner;

public class Main {
	static int N;
	
	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		
		N=sc.nextInt();
		
		dfs(2,1);
		dfs(3,1);
		dfs(5,1);
		dfs(7,1);
		
	}//main

	private static void dfs(int i, int count) {
		
		if (!isPrime(i)) {
//			System.out.println(i+"소멸");
			return ;
		}
		
//		System.out.printf("%d-%d번째\n",i,count);
		
		if (N==count) {
			System.out.println(i);
			return;
		}
		
		
		dfs((i*10)+1,count+1);
		dfs((i*10)+3,count+1);
		dfs((i*10)+5,count+1);
		dfs((i*10)+7,count+1);
		dfs((i*10)+9,count+1);
	}
	
	private static boolean isPrime(int num) {
		
		for (int i = 2; i <= num/2; i++) {
			if (num%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	

}//class