class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        answer = answer / numbers.length;
        //String avg = String.format("%.1f", answer);
        
        return answer;
    }
}