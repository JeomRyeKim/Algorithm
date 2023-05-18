class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length >= 11) {
            for(int n : num_list ) answer += n;
        } else {
            for(int n : num_list ) {
                if(answer == 0) answer = n;
                else answer *= n;
            }
        }
        return answer;
    }
}