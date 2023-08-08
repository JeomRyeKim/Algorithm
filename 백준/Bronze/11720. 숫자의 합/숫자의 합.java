import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] ars) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String B = sc.next();

        int num = 0;

        for (char b : B.toCharArray()) {
            num += b - '0';
        }

        System.out.println(num);
    }
}