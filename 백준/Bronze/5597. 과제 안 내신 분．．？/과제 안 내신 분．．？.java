import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[30];

        for (int i = 0; i < arr.length-2; i++) {
            int A = in.nextInt();
            arr[A-1]++;
        }
        in.close();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) System.out.println(i+1);
        }
    }
}