class Solution {
    public int solution(int n) {
        int answer = 0;
        
        
        for(int i = 1; i <= n; i++) {
            answer += 1;
            if (i % 3 == 0) {
                if(answer % 3 == 0) answer = answer + 1;
            }
            
            if(String.valueOf(answer).contains("3")) {
                String strAns = String.valueOf(answer);
                strAns = strAns.replace("3", "4");
                answer = Integer.parseInt(strAns);
            }
            
            if(answer % 3 == 0) answer += 1;
        }
        
        return answer;
    }
}