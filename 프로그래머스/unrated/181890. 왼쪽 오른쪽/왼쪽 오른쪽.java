import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")) {
                for(int j = 0; j < i; j++) {
                    answer.add(str_list[j]);
                }
                break;
            }else if (str_list[i].equals("r")) {
                for(int j = i+1; j < str_list.length; j++) {
                    answer.add(str_list[j]);
                }
                break;
            }
        }
        
        // answer 리스트에 저장된 요소들을 새로운 String 배열로 복사하여 반환
        return answer.toArray(new String[0]);
    }
}