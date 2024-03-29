import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < numbers.length -1; i++) {
            for(int j = 1+i; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[set.size()];
        int idx = 0;
        for(int n : set) answer[idx++] = n;
        
        Arrays.sort(answer);
        
        return answer;
    }
}