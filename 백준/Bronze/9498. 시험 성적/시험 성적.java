import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        char score = ' ';
        if(A >= 90 && A <= 100) score = 'A';
        else if(A >= 80 && A <= 89) score = 'B';
        else if(A >= 70 && A <= 79) score = 'C';
        else if(A >= 60 && A <= 69) score = 'D';
        else score = 'F';

        System.out.println(score);
    }
}