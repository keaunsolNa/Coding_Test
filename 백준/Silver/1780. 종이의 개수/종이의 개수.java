import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	private static int[][] board3;
	private static int zero;
	private static int one;
	private static int minusOne;
	private static int N;

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		board3 = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) 
				
				board3[i][j] = Integer.parseInt(st.nextToken());
		}
		
		divide3(0, 0, N);
		
		System.out.println(minusOne);
		System.out.println(zero);
		System.out.println(one);
		
	}

	private static void divide3(int row, int col, int size) {
		
		// 모든 row와 col이 size 안에서 같다면 해당 색++
		if(check3(row, col, size)) {
			
			if(board3[row][col] == 0) zero++;
			
			else if(board3[row][col] == 1) one++;
			
			else minusOne++;
			
			return;
		}
		
		// row와 col에 다른 색이 있다면 사이즈 분할
		size /= 3;	
		
		// 1사분면 재귀호출
		divide3(row, col, size);						
		
		// 2사분면 재귀호출
		divide3(row, col + size, size);				
		
		// 3사분면 재귀호출
		divide3(row, col + size + size, size);
		
		// 4사분면 재귀호출
		divide3(row + size, col, size);				
		
		// 5사분면 재귀호출
		divide3(row + size, col + size, size);
		
		// 6사분면 재귀호출
		divide3(row + size, col + size + size, size);
		
		// 7사분면 재귀호출
		divide3(row + size + size, col, size);
		
		// 8 사분면 재귀호출
		divide3(row + size + size, col + size, size);

		// 9 사분면 재귀호출
		divide3(row + size + size, col + size + size, size);

	}

	private static boolean check3(int row, int col, int size) {
		
		// 검사의 기준이 될 칸
		int color = board3[row][col];	
		
		for(int i = row; i < row + size; i++) {
			
			for(int j = col; j < col + size; j++) {
				
				// 색깔이 기준값과 다르다면 false 반환
				if(board3[i][j] != color) return false;
			}
		}
		
		return true;
	}
}
