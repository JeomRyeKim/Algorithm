import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Integer[] array = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        int answer = nums.length / 2 > set.size() ? set.size() : nums.length / 2;
        return answer;
    }
}