class Solution {
    public long solution(int price, long money, int count) {
        int p = 0;
        
        for(int i=0; i<count; i++) {
            p += price;
            money -= p;
        }

        return money < 1 ? Math.abs(money) : 0;
    }
}