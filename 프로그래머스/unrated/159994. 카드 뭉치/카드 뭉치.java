class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int len1 = 0;
        int len2 = 0;
        
        for(int i=0; i<goal.length; i++) {
            if(len1 < cards1.length && cards1[len1].equals(goal[i])) {
                goal[i] = "";
                len1++;
            } else if (len2 < cards2.length && cards2[len2].equals(goal[i])) {
                goal[i] = "";
                len2++;
            }
        }
        
        for(String g : goal) {
            if(g != "") answer = "No";
        }
        
        return answer;
    }
}