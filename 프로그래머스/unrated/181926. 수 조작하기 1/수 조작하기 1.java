class Solution {
    public int solution(int n, String control) {
        String[] keywordArr = new String[] { "w", "s", "d", "a" };
        String[] controlArr = control.split("");
        
        for(String s : controlArr) {
            if(keywordArr[0].equals(s)) {
                n += 1;
            } else if (keywordArr[1].equals(s)) {
                n -= 1;
            } else if (keywordArr[2].equals(s)) {
                n += 10;
            } else if (keywordArr[3].equals(s)) {
                n -= 10;
            }
        }
        
        int answer = n;
        
        return answer;
    }
}