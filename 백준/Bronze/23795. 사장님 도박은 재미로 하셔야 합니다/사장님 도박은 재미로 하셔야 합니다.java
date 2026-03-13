import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cur=0;
        int sum=0;
        
        while(cur!=-1){
            cur=sc.nextInt();
            
            if(cur==-1)
                break;
            sum+=cur;
            
        }
        System.out.print(sum);
        
        sc.close();
    }
}