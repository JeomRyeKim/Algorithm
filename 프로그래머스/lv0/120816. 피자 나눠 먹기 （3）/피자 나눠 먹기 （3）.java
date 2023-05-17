class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        while(true) {
            if(slice * answer < n) answer += 1;
            else break;
        }
        
        return answer;
    }
}