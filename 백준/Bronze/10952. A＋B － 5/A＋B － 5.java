import java.util.*;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while(true) {
            int A = in.nextInt();
            int B = in.nextInt();
            if(A == 0 && B == 0) break;
            else list.add(A + B);
        }

        for(int l : list) System.out.println(l);
    }
}