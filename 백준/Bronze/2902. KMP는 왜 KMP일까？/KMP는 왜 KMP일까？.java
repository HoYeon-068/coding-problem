import java.util.Scanner;

public class Main {    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        String n = sc.next();
        
        String arr[]=n.split("-");
        
        String answer="";
        
        for(int i=0;i<arr.length;i++){
            answer+=arr[i].charAt(0);
        }
        
        
        System.out.print(answer);
        sc.close();
    }
}