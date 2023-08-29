import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++) {
            String str = String.valueOf(i);
            str = str.replace("0", "").replace("5", "");
            if(str == "") list.add(i);
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer.length > 1 ? answer : new int[]{-1};
    }
}