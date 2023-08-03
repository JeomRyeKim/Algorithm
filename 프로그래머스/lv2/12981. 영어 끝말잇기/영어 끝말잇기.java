import java.util.Arrays;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        
        for(int i=1; i<words.length; i++) {
            boolean wordFound = false;
            for (int j = 0; j < i; j++) {
                if (words[j].equals(words[i])) {
                    wordFound = true;
                    break;
                }
            }
            
            char lastWord = words[i-1].charAt(words[i-1].length() - 1);
            char firstWord = words[i].charAt(0);
            
            if(lastWord != firstWord || wordFound) {
                answer[0] = (i % n) + 1;
                answer[1] = Math.round((i / n) + 1);
                break;
            }
        }

        return answer;
    }
}