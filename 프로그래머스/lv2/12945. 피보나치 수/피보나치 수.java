class Solution {
    public int solution(int n) {
        int[] nums = new int[n+1];
        
        nums[1] = 1;
        for(int i=2; i<=n; i++) {
            nums[i] = (nums[i-2] + nums[i-1]) % 1234567;
        }
        
        return nums[n];
    }
}