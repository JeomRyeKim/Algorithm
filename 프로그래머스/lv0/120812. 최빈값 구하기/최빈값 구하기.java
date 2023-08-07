import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = 0;
        int[] nums = new int[1000];
        
        for(int i=0; i<array.length; i++) {
            nums[array[i]]++;
        }

        int max = Arrays.stream(nums).max().getAsInt();

        int alone = 0;
        for(int i=0; i<nums.length; i++) {
            if(max == nums[i]) {
                alone++;
                answer = i;
            }
        }
        
        return alone == 1 ? answer : -1;
    }
}