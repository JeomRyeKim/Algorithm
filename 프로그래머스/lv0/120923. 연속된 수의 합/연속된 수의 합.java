class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        for(int i=0; i<num; i++) {
            if(num % 2 == 0) {
                answer[i] = i + (total/num +1) - (num/2);
            } else {
                answer[i] = i + (total/num) - (num/2);
            }
        }

        return answer;
    }
}