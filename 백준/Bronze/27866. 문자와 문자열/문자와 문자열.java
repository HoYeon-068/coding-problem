import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int b = Integer.parseInt(sc.nextLine());

        System.out.println(a.charAt(b-1));
    }
}
