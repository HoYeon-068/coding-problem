import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        
        
        
        System.out.println(a+b-c);
        
        
        String s=a+""+b;
        int p=Integer.parseInt(s)-c;
        
        System.out.println(p);
        
        sc.close();
    }
}