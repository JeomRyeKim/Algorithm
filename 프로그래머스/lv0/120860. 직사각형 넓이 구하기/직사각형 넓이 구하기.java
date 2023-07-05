import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        Arrays.sort(dots, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                 if(o1[0] == o2[0]) {
                     return o1[1] - o2[1];
                 }else {
                     return o1[0] - o2[0]; 
                 }
            }
        });

        int x = Math.abs(dots[0][0] - dots[2][0]);
        int y = Math.abs(dots[0][1] - dots[1][1]);
        
        return x * y;
    }
}