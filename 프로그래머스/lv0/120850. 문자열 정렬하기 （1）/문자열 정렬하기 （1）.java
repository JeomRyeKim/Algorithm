import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}