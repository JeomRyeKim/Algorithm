class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(!s.equals("1")) {
            int cnt = 0;
            for(String str : s.split("")) {
                if(str.equals("0")) {
                    cnt++;
                }
            }
            
            s = Integer.toBinaryString(s.length() - cnt);
            answer[0]++;
            answer[1] += cnt;
        }
        
        return answer;
    }
}
