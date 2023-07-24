class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;

        for(String str : s.split("")) {
            if(str.equals(" ")) {
                answer += " ";
                idx = 0;
            } else if(idx == 0) {
                answer += str.toUpperCase();
                idx++;
            } else if(idx != 0) {
                answer += str.toLowerCase();
                idx++;
            }
        }
        
        return answer;
    }
}