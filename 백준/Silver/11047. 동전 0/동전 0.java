import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int K=sc.nextInt();
		
		int coinArr[]=new int[N];
		int answer=0;
		
		
		for (int i = 0; i < N; i++) {
			coinArr[i]=sc.nextInt();
		}
		
		
		int index=N-1;
		
		while (K!=0) {
			while (K/coinArr[index]!=0) {
				
				answer+=K/coinArr[index];
				K%=coinArr[index];
				
			}
			index--;
		}
		
		
		System.out.println(answer);
		
	}//main
	
	
}//class