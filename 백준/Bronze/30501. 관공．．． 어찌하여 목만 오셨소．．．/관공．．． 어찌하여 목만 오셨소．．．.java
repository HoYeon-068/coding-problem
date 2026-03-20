import java.util.Scanner;

public class Main {    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            String name=sc.next();
            
            if(name.contains("S")){
                System.out.print(name);
            }
               
        }
        
        sc.close();
    }
}