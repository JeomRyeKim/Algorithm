class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] hands = {10, 12};
        
        for(int n : numbers) {
            if(n == 1 || n == 4 || n == 7) {
                answer += "L";
                hands[0] = n;
            } else if(n == 3 || n == 6 || n == 9) {
                answer += "R";
                hands[1] = n;
            } else {
                if(n==0) n=11;
                int left = Math.abs(n-hands[0])/3 + Math.abs(n-hands[0])%3;
                int right = Math.abs(n-hands[1])/3 + Math.abs(n-hands[1])%3;
                
                if(left > right) {
                    answer += "R";
                    hands[1] = n;
                } else if(left < right) {
                    answer += "L";
                    hands[0] = n;
                } else {
                    if(hand.equals("right")) {
                        answer += "R";
                        hands[1] = n;
                    } else {
                        answer += "L";
                        hands[0] = n;
                    }
                }
            }
        }
        
        return answer;
    }
}