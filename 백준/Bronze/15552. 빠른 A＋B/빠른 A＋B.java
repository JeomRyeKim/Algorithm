import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] ars) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int A = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i=0; i<A; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");

        }

        br.close();
        bw.flush();
        br.close();
    }
}