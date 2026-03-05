import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr_k[]=new int[10];
        int arr_j[]=new int[10];
        
        for(int i=0;i<arr_k.length;i++){
            arr_k[i]=sc.nextInt();
        }
        
        for(int i=0;i<arr_j.length;i++){
            arr_j[i]=sc.nextInt();
        }
        
        Arrays.sort(arr_k);
        Arrays.sort(arr_j);
        
        int k_length=arr_k.length;
        int j_length=arr_j.length;
        
        int result_k=arr_k[k_length-1]+arr_k[k_length-2]+arr_k[k_length-3];
        int result_j=arr_j[j_length-1]+arr_j[j_length-2]+arr_j[j_length-3];
        
        System.out.print(result_k+" "+result_j);
        
        // 예: int n = sc.nextInt();
        
        sc.close();
    }
}