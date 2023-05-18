class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] arrS = num_str.split("");
        
        for(String s : arrS) {
            answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}