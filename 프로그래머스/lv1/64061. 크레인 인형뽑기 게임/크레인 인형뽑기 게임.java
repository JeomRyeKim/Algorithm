import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> basket = new ArrayList<>();
        
        for(int m : moves) {
            int idx = m - 1;
            
            for(int j = 0; j < board.length; j++) {
                if(board[j][idx] != 0) {
                    int doll = board[j][idx];
                    board[j][idx] = 0;
                    
                    if(!basket.isEmpty() && basket.get(basket.size() - 1) == doll) {
                        basket.remove(basket.size() - 1);
                        answer += 2;
                    } else {
                        basket.add(doll);
                    }
                    
                    break;
                }
            }
        }
        
        return answer;
    }
}
