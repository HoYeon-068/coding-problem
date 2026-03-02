import java.util.Scanner;

public class Main { // 클래스 이름은 반드시 Main이어야 합니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[]=new int[5];
        
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        
        int result=0;
        for(int i=0;i<5;i++){
            result+=arr[i]*arr[i];
        }
        
        
        System.out.print(result%10);
        
        // 여기에 코드 작성
        // 예: int n = sc.nextInt();
        
        sc.close();
    }
}