import java.util.Scanner;

public class Main {    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();
        
        int result=0;
        
        
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            
            if(temp==0)
                result--;
            else
                result++;
                
        }
        
        System.out.print(result>0?"Junhee is cute!":"Junhee is not cute!");
        
        sc.close();
    }
}