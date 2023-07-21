import java.util.*;

class Solution {
    class Fail {
        int stage;   // 스테이지 번호
        double rate; // 비율
        Fail(int stage, double rate) {
            this.stage = stage;
            this.rate = rate;
        }
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<Fail> fails = new ArrayList<Fail>();
        int total = stages.length;
        
        // 각 스테이지의 인원수를 구함(1스테이지는 인덱스 0번에 저장되도록 -1을 사용)
        int[] users = new int[N+1];
        for(int s : stages) users[s-1]++;
        
        // 각 스테이지의 비율을 구함
        for(int i=0; i<N; ++i) {
            if(users[i] == 0) {
                fails.add(new Fail(i+1, 0));
            } else {
                fails.add(new Fail(i+1, (double)users[i]/total));
                // 실패율을 구하고 난 뒤 분모에 전 분자만큼 빼줘서 비율을 조정함
                total -= users[i];
            }
        }
        
        // 비율별로 내림차순으로 정렬(비율이 같다면 작은 숫자가 앞으로 오도록)
        Collections.sort(fails, new Comparator<Fail>() {
            public int compare(Fail a, Fail b) {
                if(a.rate < b.rate) 
                    return 1;
                else if(a.rate > b.rate) 
                    return -1;
                else return a.stage > b.stage ? 1 : -1;
            }
        });
        
        // 정렬된 실패율의 스테이지 번호만 추출하여 저장
        for(int i=0; i<N; ++i) {
            answer[i] = fails.get(i).stage;
        }
        
        return answer;
    }
}