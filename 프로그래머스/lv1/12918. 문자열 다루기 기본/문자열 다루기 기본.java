class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6) answer = false;

        for(char ch : s.toCharArray()) {
            if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
                answer = false;
            }
        }
        
        return answer;
    }
}