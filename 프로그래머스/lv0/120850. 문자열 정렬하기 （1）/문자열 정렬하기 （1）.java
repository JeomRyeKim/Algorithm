import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String str = "";
        for(char c : my_string.toCharArray()) {
            if(c >= '0' && c <= '9') str += c;
        }
        
        int[] answer = Arrays.stream(str.split("")).sorted().mapToInt(Integer::parseInt).toArray();
        return answer;
    }
}