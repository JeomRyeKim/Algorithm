import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        for(int i = -1000; i < 1000; i++) {
            if((A + i) / 2 == B) {
                System.out.println(i);
                break;
            }
        }
    }
}