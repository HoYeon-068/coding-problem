import java.util.Scanner;

public class Main {    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String myMbti=sc.nextLine();

        int n = sc.nextInt();
        
        sc.nextLine();
        
        int count=0;
        
        for(int i=0;i<n;i++){
            String mbti=sc.nextLine();
            if(myMbti.equals(mbti))
                count++;
        }
        
        System.out.print(count);
        
        sc.close();
    }
}