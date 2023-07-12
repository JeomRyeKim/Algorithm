//import java.util.*;

class Solution {
    public int solution(int n) {
        StringBuffer sb = new StringBuffer(Integer.toString(n, 3)).reverse(); 
        return Integer.parseInt(String.valueOf(sb),3);
    }
}