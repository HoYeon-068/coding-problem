import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int max=0;
		double sum=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			max=Math.max(max, arr[i]);
			sum+=arr[i];
		}
		System.out.println(sum/max/n*100.0); 
		
	}
}
