class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int idx = 0;

        for(int i=0; i<s.length(); i++) {
            if(str[i].equals(" ")) {
                answer += " ";
                idx = 0;
            } else if(idx == 0) {
                answer += str[i].toUpperCase();
                idx++;
            } else if(idx != 0) {
                answer += str[i].toLowerCase();
                idx++;
            }
        }
        
        return answer;
    }
}