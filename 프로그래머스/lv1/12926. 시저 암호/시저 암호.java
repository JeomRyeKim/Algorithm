class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();
        
        for(int c : ch) {
            if(c != ' ') {
                for(int i = 0; i < n; i++) {
                    c++;
                    if(c == 91) c = 65;
                    if(c == 123) c = 97;
                }
                answer += (char) c;
            } else answer += ' '; 
        }
        
        return answer;
    }
}