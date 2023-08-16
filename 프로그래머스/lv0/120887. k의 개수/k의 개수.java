class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int num = i; num <= j; num++) {
            String nn = String.valueOf(num);
            
            for(int n=0; n<nn.length(); n++) {
                if (nn.charAt(n) == (char) (k + '0')) answer++;
            }
        }
        
        return answer;
    }
}