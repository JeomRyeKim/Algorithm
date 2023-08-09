import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (in.hasNext()) {
            int A = in.nextInt();
            int B = in.nextInt();

            if(A == 0 && B == 0) break;
            else list.add(A > B ? "Yes" : "No");
        }

        for(String l : list) System.out.println(l);
    }
}