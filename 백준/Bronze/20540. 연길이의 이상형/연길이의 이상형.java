import java.util.Scanner;

public class Main {    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        String mbti = sc.nextLine();
        
        String result="";
        
        if(mbti.charAt(0)=='E')
            result+="I";
        else
            result+="E";
        
        if(mbti.charAt(1)=='S')
            result+="N";
        else
            result+="S";
        
        if(mbti.charAt(2)=='F')
            result+="T";
        else
            result+="F";
        
        if(mbti.charAt(3)=='P')
            result+="J";
        else
            result+="P";
        
        System.out.print(result);
        
        sc.close();
    }
}