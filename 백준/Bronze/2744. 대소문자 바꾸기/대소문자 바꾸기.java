import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        char[] arr = in.next().toCharArray();
        String str = "";

        for(char c : arr) {
            if(c >= 'A' && c <= 'Z') str += Character.toLowerCase(c);
            else str += Character.toUpperCase(c);
        }

        System.out.println(str);
    }
}