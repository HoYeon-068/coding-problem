import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        
        int countArr[]=new int[26];
        
        for(int i=0;i<a.length();i++){
            countArr[(int)a.charAt(i)-97]++; 
        }
        
        for(int i=0;i<countArr.length;i++){
            System.out.print(countArr[i]+" ");
        }
        
        sc.close();
    }
}