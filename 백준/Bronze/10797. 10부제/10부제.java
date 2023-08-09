import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int car = 0;

        for(int i=0; i<5; i++) {
            if(in.nextInt() == A) car++;
        }

        System.out.println(car);
    }
}