import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()) {
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println(A + B);
        }

        in.close();
    }
}