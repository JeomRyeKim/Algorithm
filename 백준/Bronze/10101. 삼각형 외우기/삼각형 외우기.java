import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        if(A == 60 && B == 60 && C == 60) System.out.println("Equilateral");
        else if(A + B + C == 180) {
            if(A == B || B == C || A == C) System.out.println("Isosceles");
            else System.out.println("Scalene");
        } else System.out.println("Error");
    }
}