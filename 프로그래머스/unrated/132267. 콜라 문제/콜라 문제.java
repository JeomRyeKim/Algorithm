class Solution {
    public int solution(int a, int b, int n) {
        int cola = n;
        int answer = 0;
        
        while(cola >= a) {
            answer += (cola / a) * b;
            cola = ((cola / a) * b) + (cola % a);
        }
        
        return answer;
    }
}