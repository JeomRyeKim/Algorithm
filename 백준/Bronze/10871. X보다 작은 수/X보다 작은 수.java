import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        int[] arr = new int[A];

        for(int i = 0; i < A; i++) {
            arr[i] = in.nextInt();
        }

        for(int a : arr) {
            if(a < B) System.out.print(a + " ");
        }
    }
}