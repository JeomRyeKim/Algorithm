import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        
        return result(arr);
    }
    
    // 1. 최대 공약수 구하기 - 유클리드 호제법
    private static int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    // 2. 2개의 수에 대한 최소 공배수 구하기
    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    // 3. 배열의 모든 수에 대한 최소 공배수 구하기
    private static int result(int[] arr) {
        int result = arr[0];
        
        for(int i=1; i<arr.length; i++) {
            result = lcm(result, arr[i]);
        }
        return result;
    }
}