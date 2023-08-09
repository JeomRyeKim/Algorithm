import java.util.ArrayList;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        // [a-b, c-d],[a-c, b-d],[a-d, b-c]
        // a/b == c/d
        // ((y1 - y2) / (x1 - x2)) == ((y3 - y4) / (x3 - x4))
        if (((double)(dots[0][1] - dots[1][1]) / (double)(dots[0][0] - dots[1][0]))
            == ((double)(dots[2][1] - dots[3][1]) / (double)(dots[2][0] - dots[3][0]))) {
            return 1;
        }
        
        // a/c == b/d
        // ((y1 - y3) / (x1 - x3)) == ((y2 - y4) / (x2 - x4))
        if (((double)(dots[0][1] - dots[2][1]) / (double)(dots[0][0] - dots[2][0]))
            == ((double)(dots[1][1] - dots[3][1]) / (double)(dots[1][0] - dots[3][0]))) {
            return 1;
        }
        
        // a/d == b/c
        // ((y1 - y4) / (x1 - x4)) == ((y3 - y2) / (x3 - x2))
        if (((double)(dots[0][1] - dots[3][1]) / (double)(dots[0][0] - dots[3][0]))
            == ((double)(dots[2][1] - dots[1][1]) / (double)(dots[2][0] - dots[1][0]))) {
            return 1;
        }

        return answer;
    }
}