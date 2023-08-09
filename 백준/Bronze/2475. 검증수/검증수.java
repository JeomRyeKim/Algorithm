import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);

        int num = 0;
        for(int i = 0; i < 5; i++) {
            int A = in.nextInt();
            num += A * A;
        }

        System.out.println(num % 10);
    }
}