import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();

        int[] arr = new int[26];
        for(int i=0; i<arr.length; i++) arr[i] = -1;
        
        char[] ch = A.toCharArray();
        for(int i=0; i<ch.length; i++) {
            if(arr[ch[i] - 'a'] == -1) arr[ch[i] - 'a'] = i;
        }

        for(int a : arr) System.out.println(a);
    }
}