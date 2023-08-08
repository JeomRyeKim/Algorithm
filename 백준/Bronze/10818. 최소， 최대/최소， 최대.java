import java.util.*;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int[] arr = new int[A];

        for(int i = 0; i < A; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.stream(arr).min().getAsInt() + " " + Arrays.stream(arr).max().getAsInt());
    }
}