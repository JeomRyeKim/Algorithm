import java.util.*;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int[] arr = new int[A];

        for(int i = 0; i < A; i++) {
            int B = in.nextInt();
            int C = in.nextInt();
            arr[i] = B + C;
        }

        for(int i = 1; i <= arr.length; i++) System.out.println("Case #" + i + ": " + arr[i-1]);
    }
}