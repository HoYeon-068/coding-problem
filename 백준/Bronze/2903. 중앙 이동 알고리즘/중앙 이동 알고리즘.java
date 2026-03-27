import java.util.Scanner;

public class Main {    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();
        
        int result=2;
        
        
        for(int i=0;i<n;i++){
             result+=(int)Math.pow(2, i);       
        }
        
        System.out.print(result*result);
        
        sc.close();
    }
}