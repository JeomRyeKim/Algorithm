class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;
        int p = 0;
        
        for(int i=0; i<count; i++) {
            p += price;
            answer -= p;
        }

        return answer < 1 ? Math.abs(answer) : 0;
    }
}