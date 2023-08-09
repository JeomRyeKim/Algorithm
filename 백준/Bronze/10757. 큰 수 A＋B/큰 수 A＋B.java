import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);

        BigInteger A = in.nextBigInteger();
        BigInteger B = in.nextBigInteger();

        System.out.println(A.add(B));
    }
}