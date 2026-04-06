import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int score=0;

        int n = sc.nextInt();        
        
        sc.nextLine();
        
        String name=sc.nextLine();
        
        for(int i=0;i<n;i++){
                score+=(int)name.charAt(i)-64;
        }
        
        System.out.print(score);
        
        sc.close();
    }
}