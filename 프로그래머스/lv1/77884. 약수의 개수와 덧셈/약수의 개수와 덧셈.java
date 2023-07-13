import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i < right+1; i++) {
            List<Integer> numList = new ArrayList<>();
            
            for(int j = 1; j < left+i; j++) {
                if(i % j == 0) numList.add(j);
            }
            
            if(numList.size() % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
}