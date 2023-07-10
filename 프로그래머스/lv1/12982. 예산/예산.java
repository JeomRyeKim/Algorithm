import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        for(int b : d) {
            if(budget - b >= 0){
                budget -= b;
                answer += 1;
            }
        }
        
        return answer;
    }
}