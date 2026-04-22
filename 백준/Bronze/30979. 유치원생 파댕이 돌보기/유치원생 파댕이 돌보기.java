import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int sum = sc.nextInt();
        
        int num=sc.nextInt();
        
        int result=0;
        
        for(int i=0;i<num;i++){
            result+=sc.nextInt();
        }
        
        if(sum<=result)
            System.out.println("Padaeng_i Happy");
        else
            System.out.println("Padaeng_i Cry");
        
        sc.close();
    }
}