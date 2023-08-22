import java.util.*;

class Solution {
    public static String reverse(String str, int s, int e) {
        char[] arr = str.toCharArray();
        
        for (int i = s, j = e; i < j; i++, j--) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        
        return new String(arr);
    }
    
    public String solution(String my_string, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            my_string = reverse(my_string, queries[i][0], queries[i][1]);
        }
        
        return my_string;
    }
}
