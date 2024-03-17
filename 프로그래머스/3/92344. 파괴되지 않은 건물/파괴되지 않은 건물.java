class Solution {
    public int solution(int[][] board, int[][] skill) {
        
        int answer = 0;
        int n = board.length;
        int m = board[0].length;
        int[][] sum = new int[n + 1][m + 1];
        
        for (int[] skil : skill) {

            int r1 = skil[1];
            int c1 = skil[2];
            int r2 = skil[3];
            int c2 = skil[4];
            int degree = skil[5] * (skil[0] == 1 ? -1 : 1);

            sum[r1][c1] += degree;
            sum[r1][c2 + 1] += (degree * -1);
            sum[r2 + 1][c1] += (degree * -1);
            sum[r2 + 1][c2 + 1] += degree;

        }

        for (int y = 1; y < n; y++)
            for (int x = 0; x < m; x++) sum[y][x] += sum[y - 1][x];

        for (int x = 1; x < m; x++)
            for (int y = 0; y < n; y++) sum[y][x] += sum[y][x - 1];

        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if(board[i][j] + sum[i][j] > 0) answer++;
        
        return answer;
    }
}