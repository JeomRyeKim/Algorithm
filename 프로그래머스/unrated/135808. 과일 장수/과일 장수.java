import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        // 내림차순 정렬
        Integer[] arr = new Integer[score.length];
        for(int i=score.length-1, j=0; i>=0; i--,j++) arr[j] = score[i];
        
        for(int i=m-1; i<arr.length; i+=m) {
            answer += arr[i] * m;
        }

        return answer;
    }
}