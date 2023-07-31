// x * y = brown + yellow
// x + y = (brown + 4)//2
// (x-2)(y-2)==yellow

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i=1; i<brown; i++) {
            for(int j=0+i; j<brown; j++) {
                if((i - 2 ) * (j - 2) == yellow && i * j == brown + yellow) {
                    answer[0] = j;
                    answer[1] = i;
                }
            }
        }
        return answer;
    }
}