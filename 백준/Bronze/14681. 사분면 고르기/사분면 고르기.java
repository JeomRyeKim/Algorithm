import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        int num = 0;

        if(A > 0 && B > 0) num = 1;
        else if(A < 0 && B > 0) num = 2;
        else if(A < 0 && B < 0) num = 3;
        else if(A > 0 && B < 0) num = 4;

        System.out.println(num);
    }
}