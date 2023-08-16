import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
    
        StringBuilder answer = new StringBuilder();
    
        for(char a : arr) answer.append(a);
        
        return answer.toString();
    }
}