class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length > arr2.length) {
            answer = 1;
        } else if (arr1.length < arr2.length) {
            answer = -1;
        } else if(arr1.length == arr2.length) {
            int a1 = 0;
            int a2 = 0;
            for(int i : arr1) a1 += i;
            for(int i : arr2) a2 += i;   
            if(a1 > a2) answer = 1;
            if(a1 < a2) answer = -1;
        }
        
        return answer;
    }
}