import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	private static int[][] board2;
	private static StringBuilder ans = new StringBuilder();
	private static int N;

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		board2 = new int[N][N];
		
		for(int i = 0; i < N; i++) {

			String input = br.readLine();
			for(int j = 0; j < N; j++) 
				
				board2[i][j] = Character.getNumericValue(input.charAt(j));
		}
		
		divide2(0, 0, N);
		
		System.out.print(ans);
		
	}

	private static void divide2(int row, int col, int size) {
		
		// 모든 row와 col이 size 안에서 같다면 해당 색++
		if(check2(row, col, size)) return;
		
		
		// row와 col에 다른 색이 있다면 사이즈 분할
		int newSize = size / 2;	
		
		ans.append("(");

		// 1사분면 재귀호출
		divide2(row, col + newSize, newSize);				
		
		// 2사분면 재귀호출
		divide2(row, col, newSize);						
		
		// 3사분면 재귀호출
		divide2(row + newSize, col, newSize);				
		
		// 4사분면 재귀호출
		divide2(row + newSize, col + newSize, newSize);

		ans.append(")");
		
	}

	private static boolean check2(int row, int col, int size) {
		
		// 검사의 기준이 될 칸
		int color = board2[row][col];	
		
		for(int i = row; i < row + size; i++) {
			
			for(int j = col; j < col + size; j++) {
				
				// 색깔이 기준값과 다르다면 false 반환
				if(board2[i][j] != color) return false;
			}
		}
		
		// 검사 시 모든 행, 열이 일치하면 true 반환

		ans.append(color);
		return true;
	}
}
