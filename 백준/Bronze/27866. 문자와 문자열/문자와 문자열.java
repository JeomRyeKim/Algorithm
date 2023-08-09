import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int num = in.nextInt();

        System.out.println(str.substring(num-1, num));
    }
}