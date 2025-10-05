import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());
		
		int arr[]=new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		int temp;
		
		for (int i = 0; i < N; i++) {
			for (int j = 1; j < N-i; j++) {
				if (arr[j-1]>arr[j]) {
					
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				} 
			}
		}
		
		
		
		for (int i = 0; i < N; i++) {
			bw.write(arr[i]+"\n");
		}
		bw.flush();
	}

}