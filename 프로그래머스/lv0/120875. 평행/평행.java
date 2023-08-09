import java.util.ArrayList;

class Solution {
    public double inclination(int[] dot1, int[]dot2) {
        return (double) (dot1[1] - dot2[1]) / (dot1[0] - dot2[0]);
    }
    
    public int solution(int[][] dots) {
        int answer = 0;
        
        // [a-b, c-d],[a-c, b-d],[a-d, b-c]
        // a/b == c/d
        // ((y1 - y2) / (x1 - x2)) == ((y3 - y4) / (x3 - x4))
        if (inclination(dots[0], dots[1]) == inclination(dots[2], dots[3])) return 1;
        
        
        // a/c == b/d
        // ((y1 - y3) / (x1 - x3)) == ((y2 - y4) / (x2 - x4))
        if (inclination(dots[0], dots[2]) == inclination(dots[1], dots[3])) return 1;
        
        // a/d == b/c
        // ((y1 - y4) / (x1 - x4)) == ((y3 - y2) / (x3 - x2))
        if (inclination(dots[0], dots[3]) == inclination(dots[2], dots[1])) return 1;

        return answer;
    }
}