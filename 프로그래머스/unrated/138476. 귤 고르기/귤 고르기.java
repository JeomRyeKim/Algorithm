import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int t : tangerine) map.put(t, map.getOrDefault(t, 0)+1);
        
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        
        for(Integer l : list) {
            if(k < 1) return answer;
            k -= l;
            answer++;
        }
        
        return answer;
    }
}