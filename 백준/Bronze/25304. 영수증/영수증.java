import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        for(int i = 0; i < B; i++) {
            int C = in.nextInt();
            int D = in.nextInt();
            A -= C * D;
        }

        System.out.println(A == 0 ? "Yes" : "No");
    }
}