import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> threeList = new ArrayList<>();
        
        for(int num : numlist) {
            if(num % n == 0) threeList.add(num);
        }
        
        int[] answer = new int[threeList.size()];
        for (int i = 0; i < threeList.size(); i++) {
            answer[i] = threeList.get(i);
        }
        
        return answer;
    }
}