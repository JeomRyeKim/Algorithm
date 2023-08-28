import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] days = new int[progresses.length];
        
        // 작업 일수
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] < 100) {
                progresses[i] += speeds[i];
                days[i]++;
            }
        }
        
        int max = days[0];
        int count = 1;
        // 배포 일수
        for(int i=1; i<days.length; i++) {
            if(max >= days[i]){
                count++;
            } else {
                max = days[i];
                result.add(count);
                count = 1;
            }
        }
        result.add(count); // 마지막 배포 일수 추가
        
        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}