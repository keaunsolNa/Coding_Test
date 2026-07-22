class Solution {
    public int numRookCaptures(char[][] board) {

        int[] rook = findRook(board);
        int ans = 0;


        for (int j = rook[1] + 1; j < 8; j++) {

            if (board[rook[0]][j] == 'p') {
                ans++;
                break;
            }
            if (board[rook[0]][j] == 'B') break;
        }

        for (int j = rook[1] - 1; j >= 0; j--) {

            if (board[rook[0]][j] == 'p') {
                ans++;
                break;
            }
            if (board[rook[0]][j] == 'B') break;
        }

        
        for (int j = rook[0] + 1; j < 8; j++) {

            if (board[j][rook[1]] == 'p') {
                ans++;
                break;
            }
            if (board[j][rook[1]] == 'B') break;
        }

        for (int j = rook[0] - 1; j >= 0; j--) {

            if (board[j][rook[1]] == 'p') {
                ans++;
                break;
            }
            if (board[j][rook[1]] == 'B') break;
        }

        return ans;
        

    }

    public int[] findRook(char[][] board) {

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                if (board[i][j] == 'R') {
                    return new int[] {i, j};
                }
            }
        }       

        return new int[]{0, 0};
    }

}