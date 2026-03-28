import java.util.Scanner;

public class Main {    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        // 예: int n = sc.nextInt();
        
        int sum[]=new int[2];
        
        
        
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                sum[i] += sc.nextInt();
            }
        }
        
        System.out.print(sum[0]<sum[1]?sum[1]:sum[0]);
        
        
        sc.close();
    }
}