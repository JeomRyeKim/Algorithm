import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 1) {
                    for (int dx = -1; dx <= 1; dx++) {
                        for (int dy = -1; dy <= 1; dy++) {
                            int ni = i + dx;
                            int nj = j + dy;

                            if (ni >= 0 && ni < rows && nj >= 0 && nj < cols && board[ni][nj] != 1) {
                                board[ni][nj] = 2;
                            }
                        }
                    }
                }
            }
        }

        for (int[] boards : board) {
            for (int b : boards) {
                if (b == 0) answer++;
            }
        }

        return answer;
    }
}
