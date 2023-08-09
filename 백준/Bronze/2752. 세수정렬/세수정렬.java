import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        for(int a : arr) System.out.print(a + " ");
    }
}