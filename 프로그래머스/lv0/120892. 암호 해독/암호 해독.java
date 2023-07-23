class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        cipher = "a" + cipher;
        for(int i=code; i<cipher.length(); i = i+code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }
}