import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);

        int num = (in.nextInt() * in.nextInt() * in.nextInt());

        int[] arr = new int[10];

        for(char i : String.valueOf(num).toCharArray()) {
            arr[i - '0']++;
        }

        for(int a : arr) System.out.println(a);

    }
}