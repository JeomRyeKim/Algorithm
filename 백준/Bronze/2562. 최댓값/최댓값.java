import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[9];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);

        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max == arr[i]) idx = i +1;
        }
        System.out.println(idx);

    }
}