class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() % 2 != 0) {
            answer = false;
        } else {
            int cnt = 0;
            
            for(char c : s.toCharArray()) {
                if(c =='(') cnt++;
                else cnt--;
                
                if(cnt < 0) answer = false;
            }
            if(cnt != 0) answer = false;
        }

        return answer;
    }
}