class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 1단계
        new_id = new_id.toLowerCase();
        
        // 2단계
        for(char c : new_id.toCharArray()) {
           if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.')
               answer += c;
        }
        
        // 3단계
        while(answer.contains("..")) {
            answer = answer.replace("..", ".");
        }
        
        // 4단계
        if(answer.startsWith(".")) 
            answer = answer.substring(1, answer.length());
        else if (answer.endsWith("."))
            answer = answer.substring(0, answer.length()-1);
        
        // 5단계
        if(answer.equals("")){
            answer = "a";
        }
        
        // 6단계
        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }
        // 6.5단계
        if(answer.startsWith(".")) 
            answer = answer.substring(1, answer.length());
        else if (answer.endsWith("."))
            answer = answer.substring(0, answer.length()-1);
        
        // 7단계
        if(answer.length() <= 2) {
            while(answer.length() < 3)
                answer += answer.charAt(answer.length()-1);
        }
        
        return answer;
    }
}