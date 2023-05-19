class Solution {
    public int solution(int a, int b) {
        String ab = "" + a + b;
        String ba = "" + b + a;
        int answer = Integer.parseInt(ab) > Integer.parseInt(ba) ? Integer.parseInt(ab) : Integer.parseInt(ba);
        return answer;
    }
}