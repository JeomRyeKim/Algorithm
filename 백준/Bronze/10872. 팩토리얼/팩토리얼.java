import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int num = 1;

        for(int i = 1; i <= A; i++) {
            num *= i;
        }
        System.out.println(num);
    }
}