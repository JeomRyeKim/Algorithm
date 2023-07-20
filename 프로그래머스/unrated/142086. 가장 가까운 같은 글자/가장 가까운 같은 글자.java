class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;

        for(int i = 1; i < s.length(); i++) {
            int str = s.substring(0, i).lastIndexOf(s.charAt(i));
            if(str != -1) {
                answer[i] = i-str;
            } else {
                answer[i] = str;
            }
        }
        
        return answer;
    }
}