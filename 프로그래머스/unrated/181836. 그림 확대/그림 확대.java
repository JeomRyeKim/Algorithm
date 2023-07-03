class Solution {
    public String[] solution(String[] picture, int k) { 
        String[] answer = new String[picture.length * k];
        String[] words = new String[picture.length]; // k배수 만큼 늘린 picture 문자열 모음
                
        // 배열[i]의 문자열을 1개씩 잘라서 k번씩 반복하여 words를 만듦
        for(int i = 0; i < picture.length; i++) {
            String word = "";
            
            for(int j = 0; j < picture[i].length(); j++) {
                for(int n = 0; n < k; n++) {
                    word += picture[i].charAt(j);
                }
            }
            words[i] = word;
        }
        
        // 만든 words들을 k만큼 반복하여 answer에 등록
        int num = picture.length * k;
        int idx = 0;
        for(int i = 0; i < picture.length; i++) {
            for(int j = 0; j < k; j++) {
                answer[idx] = words[i];
                if(idx < num) idx += 1;
            }
        }
        
        return answer;
    }
}