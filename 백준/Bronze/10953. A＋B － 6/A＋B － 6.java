import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String []arr=new String[n];
        sc.nextLine();
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
        }
        
        
        for(int i=0;i<arr.length;i++){
            String[] arrT=arr[i].split(",");
            
            int a=Integer.parseInt(arrT[0]);
            int b=Integer.parseInt(arrT[1]);
                
            System.out.println(a+b);    
            
        }
        
        sc.close();
    }
}