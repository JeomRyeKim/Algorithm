import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length > 1 ? arr.length-1 : 1];
        int idx = 0;
        int min = Arrays.stream(arr).min().getAsInt();
        
        if(answer.length != 1) {
           for(int i=0; i<arr.length; i++) {
                if(arr[i] == min) continue;
                else answer[idx++] = arr[i];
            } 
        } else answer[0] = -1;
            
        return answer;
    }
}