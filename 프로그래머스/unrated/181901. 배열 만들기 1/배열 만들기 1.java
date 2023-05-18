class Solution {
    public int[] solution(int n, int k) {
        String num = "";
        
        for(int i = 1; i <= n; i++) {
            if(i % k == 0) {
                num += i + ",";
            } else continue;
        }
        
        String[] strArr = num.split(",");
        int[] answer = new int[strArr.length];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }
        
        return answer;
    }
}