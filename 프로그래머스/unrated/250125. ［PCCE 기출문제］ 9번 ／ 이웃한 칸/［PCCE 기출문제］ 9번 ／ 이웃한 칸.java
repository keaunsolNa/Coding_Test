class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        if(w - 1 >= 0 && board[h][w - 1].equals(board[h][w])) answer++;
        if(w + 1 < board[h].length && board[h][w + 1].equals(board[h][w])) answer++;
        if(h - 1 >= 0 && board[h - 1][w].equals(board[h][w])) answer++;
        if(h + 1 < board.length && board[h + 1][w].equals(board[h][w])) answer++;

        return answer; 
    }
}