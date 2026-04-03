import java.util.Scanner;

public class Main {    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();
        
        int result=0;
        
        for(int i=0;i<n;i++){
            int arr[]=new int[2];
            for(int j=0;j<2;j++){
                arr[j]=sc.nextInt();
            }
            result+=arr[1]%arr[0];
        }
        
        System.out.print(result);
        
        sc.close();
    }
}