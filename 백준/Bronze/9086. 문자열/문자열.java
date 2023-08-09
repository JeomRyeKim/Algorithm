import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[in.nextInt()];

        for (int i=0; i<arr.length; i++) {
            String str = in.next();
            if(str.length() < 2) {
                arr[i] = str.repeat(2);
            } else {
                arr[i] = str.substring(0, 1) + str.substring(str.length() -1, str.length());
            }
        }

        for(String a : arr) System.out.println(a);
    }
}