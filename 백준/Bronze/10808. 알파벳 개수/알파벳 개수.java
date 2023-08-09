import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        char[] S = in.next().toCharArray();
        int[] alphabet = new int[26];
        for (int i=0; i<S.length; i++) {
            alphabet[S[i] - 'a']++;
        }

        for(int a : alphabet) System.out.print(a + " ");
    }
}