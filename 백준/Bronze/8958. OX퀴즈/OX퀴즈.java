import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int[] arr = new int[A];

        for(int i=0; i<A; i++) {
            String ox = in.next();
            int suc = 0;
            int score = 0;
            for(int j=0; j<ox.length(); j++) {
                if(ox.charAt(j) == 'O') {
                    suc++;
                    score += suc;
                } else if (ox.charAt(j) == 'X') {
                    suc = 0;
                }
            }
            arr[i] = score;
        }

        for (int a : arr) System.out.println(a);
    }
}