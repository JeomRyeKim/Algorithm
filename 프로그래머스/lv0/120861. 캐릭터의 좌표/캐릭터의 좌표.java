class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        
        for (String s : keyinput) {
            switch (s) {
                case "up":
                    y = Math.min(y + 1, board[1] / 2);
                    break;
                case "down":
                    y = Math.max(y - 1, -board[1] / 2);
                    break;
                case "left":
                    x = Math.max(x - 1, -board[0] / 2);
                    break;
                case "right":
                    x = Math.min(x + 1, board[0] / 2);
                    break;
            }
        }

        return new int[]{x, y};
    }
}