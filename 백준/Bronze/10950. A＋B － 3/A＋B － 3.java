import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int[] arr = new int[A];

        for (int i = 0; i < A; i++) {
            int B = in.nextInt();
            int C = in.nextInt();
            arr[i] = B + C;
        }
        in.close();

        for(int a : arr) System.out.println(a);
    }
}