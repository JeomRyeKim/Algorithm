class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i=1; i<3628800; i++) {
            answer *= i;
            if(n < answer) {
                answer = i-1;
                break;
            }
        }
        
        return answer;
    }
}