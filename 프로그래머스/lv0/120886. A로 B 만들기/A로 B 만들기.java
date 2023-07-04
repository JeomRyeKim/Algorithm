class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        String[] be = before.split("");
        String[] af = after.split("");
        
        for(int i = 0; i < before.length(); i++) {
            for(int j = 0; j < after.length(); j++) {
                if(be[i].equals(af[j])) {
                    be[i] = " ";
                    af[j] = " ";
                }
            }
        }

        for(String a : af) {
            if(a != " ") answer = 0;
        }
        
        return answer;
    }
}