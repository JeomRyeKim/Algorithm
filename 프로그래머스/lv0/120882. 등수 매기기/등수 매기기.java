class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];
        
        for(int i=0; i<avg.length; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = 1; // 초기 순위를 1로 설정
            for(int j=0; j<answer.length; j++) {
                if(avg[i] < avg[j]) answer[i]++;
            }
        }
        
        return answer;
    }
}