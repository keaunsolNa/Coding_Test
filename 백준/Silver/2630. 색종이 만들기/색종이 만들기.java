import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int[][] board;
	private static int blue = 0;
	private static int white = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		// 최초의 사각형
		board = new int[N][N];
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) 
				board[i][j] = Integer.parseInt(st.nextToken());
			
		}
		
		// 분할 시작(N사이즈의 0, 0에서 시작)
		divide(0, 0, N);

		System.out.println(white);
		System.out.println(blue);
   }
    
    // 분할 알고리즘
	private static void divide(int row, int col, int size) {
		
		// 모든 row와 col이 size 안에서 같다면 해당 색++
		if(check(row, col, size)) {
			
			if(board[row][col] == 0) white++;
			else blue++;
			
			return;
		}
		
		// row와 col에 다른 색이 있다면 사이즈 분할
		int newSize = size / 2;	
		
		// 2사분면 재귀호출
		divide(row, col, newSize);						
		
		// 1사분면 재귀호출
		divide(row, col + newSize, newSize);				
		
		// 3사분면 재귀호출
		divide(row + newSize, col, newSize);				
		
		// 4사분면 재귀호출
		divide(row + newSize, col + newSize, newSize);
		
	}
	
	// 주어진 사분면 안에서 row와 col 일치하는지 check
	private static boolean check(int row, int col, int size) {
		
		// 검사의 기준이 될 칸
		int color = board[row][col];	
		
		for(int i = row; i < row + size; i++) {
			
			for(int j = col; j < col + size; j++) {
				
				// 색깔이 기준값과 다르다면 false 반환
				if(board[i][j] != color) return false;
			}
		}
		
		// 검사 시 모든 행, 열이 일치하면 true 반환
		return true;
	}
}