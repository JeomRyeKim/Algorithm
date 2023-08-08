import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();

        for (int i=1; i<10; i++) {
            System.out.println(A + " * " + i + " = " + A * i);
        }
    }
}