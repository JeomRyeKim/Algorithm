class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        for(int i=0; i<citations.length+1; i++) {
            int num = 0;
            
            for(int j=0; j<citations.length; j++) {
                if(i < citations[j]) num++;
            }
            
            System.out.println(i + " " + num);
            if(i == num) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}