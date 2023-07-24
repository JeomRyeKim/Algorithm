import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        String[] str = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        int[] nums = Arrays.stream(String.valueOf(age).split("")).mapToInt(Integer::parseInt).toArray();
        for(int n : nums) {
            answer += str[n];
        }
        
        return answer;
    }
}