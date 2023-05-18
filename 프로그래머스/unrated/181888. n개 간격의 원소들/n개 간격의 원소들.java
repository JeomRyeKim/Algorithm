class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx = 0;
        String nums = "";
        for(int i = 0; i < num_list.length; i++) {
            if(i % n == 0){
                nums += num_list[i] + ",";
            }
        }
        
        String[] strArr = nums.split(",");
        int[] answer = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            answer[i] += Integer.parseInt(strArr[i]);
        }

        return answer;
    }
}