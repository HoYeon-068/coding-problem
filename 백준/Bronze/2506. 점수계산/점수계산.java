import java.util.Scanner;

public class Main {    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();
        
        int result=0;
        int cur=0;
        
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            
            if(temp==1)
                result+=++cur;
            else
                cur=0;
            
        }
        
        System.out.print(result);
        
        sc.close();
    }
}