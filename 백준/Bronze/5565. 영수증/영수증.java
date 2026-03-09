import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
	int result = sc.nextInt();
        int sum=0;
        
        for(int i=0;i<9;i++){
            sum+= sc.nextInt();
        }        
        
        System.out.print(result-sum);
        
        sc.close();
    }
}