
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());

		StringTokenizer st=new StringTokenizer(br.readLine());

		long arr[]=new long[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i]=Long.parseLong(st.nextToken());
		}

		Arrays.sort(arr);

		
		long target;
		int count=0;
		long sum=0;



		for (int i = 0; i < arr.length; i++) {
			target=arr[i];
			int start=0,end=N-1;
			while (start<end) {
				sum=arr[start]+arr[end];

				if (sum==target) {
					if (start!=i&&end!=i) {
						count++;
						break;

					}else if (start==i) {
						start++;
					}else if(end==i){
						end--;
					}
					
					
				}else if(sum<target) {
					start++;
				}else {
					end--;
				}
			}
		}
		System.out.println(count);

	}//main

}//class
