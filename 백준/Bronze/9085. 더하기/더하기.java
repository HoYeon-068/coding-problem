import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();
        
        
        for(int i=0;i<n;i++){
            
            int a=sc.nextInt();
            int sum=0;
            for(int j=0;j<a;j++){
                int temp=sc.nextInt();
                sum+=temp;
            }
            System.out.println(sum);
        }
        
        sc.close();
    }
}