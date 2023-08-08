import java.util.*;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int[] arr = new int[A];
        int[] arrB = new int[A];
        int[] arrC = new int[A];

        for(int i = 0; i < A; i++) {
            int B = in.nextInt();
            int C = in.nextInt();
            arrB[i] = B;
            arrC[i] = C;
            arr[i] = B + C;
        }

        for(int i = 0; i < arr.length; i++) System.out.println("Case #" + (i+1) + ": " + arrB[i] + " + " + arrC[i] + " = " + arr[i]);
    }
}