class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++) {
            for(String w : words) {
                babbling[i] = babbling[i].replace(w, " ");
            }
            babbling[i] = babbling[i].replace(" ", "");
            if(babbling[i].equals("")) answer++;
        }

        return answer;
    }
}