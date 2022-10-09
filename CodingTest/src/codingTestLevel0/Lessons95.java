package codingTestLevel0;

import java.util.Arrays;

public class Lessons95 {

	public static void main(String[] args) {
		int[][] board = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
		int a = solution(board);
		System.out.println(a);
		
	}
	
	// 안전 지대
    public static int solution(int[][] board) {
    	
    	int answer = 0;
    	int boom = 1;
    	int[][] cloneBoard = new int[board.length][board[0].length];
    	
    	for (int i = 0; i < board.length; i++) {
    		cloneBoard[i] = Arrays.copyOf(board[i], board[i].length);
    	}
    	
    	for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				int val = board[i][j];
				
				if(val == 0) continue;
				
				makeBoard(i, j, boom, cloneBoard);
			}
		}
    	
        for (int i = 0; i < cloneBoard.length; i++) {
            for (int j = 0; j < cloneBoard[i].length; j++) {
                if(cloneBoard[i][j] == 0)
                    answer++;
            }
        }

        return answer;
    }
    
    public static void makeBoard(int row, int col, int boom, int[][] cloneBoard) {
    	for (int r = row - boom; r <= row + boom ; r++) {
            if(r < 0 || r >= cloneBoard.length) continue;

            for (int c = col - boom; c <= col + boom; c++) {
                if(c < 0 || c >= cloneBoard[0].length) continue;

                cloneBoard[r][c] = 1;
            }
        }
    }
}