package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test16_Backtracking {
	
	private static int N;
	private static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		test05();
	}
	
	
	// N-Queen
	private static int count = 0;
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        makeArr(N);
        System.out.println(count);
	}
	
	// N-Queen 배열 생성 Method
    public static void makeArr(int N) {
        int[] a = new int[N];
        countArr(a, 0);
    }
    
	// N-Queen 유효 Count Method
    public static void countArr(int[] q, int n) {
        int N = q.length;
        
        if (n == N) {
        	
            count++;
            
        } else {
        	
            for (int i = 0; i < N; i++) {
                q[n] = i;
                if (checking(q, n)) countArr(q, n + 1);   
            }
            
        }
    }
    
    //  N-Queen 백트래킹 유망성 검사
    public static boolean checking(int[] q, int n) {
    	
        for (int i = 0; i < n; i++) {
        	
            if (q[i] == q[n]) return false;   // 같은 열
            if ((q[i] - q[n]) == (n - i)) return false;   // '\' 방향
            if ((q[n] - q[i]) == (n - i)) return false;   // '/' 방향
            
        }
        
        return true;
    }
    
    // 스도쿠
    private static int[][] sudoku = new int[9][9];
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < 9; j++) {
				sudoku[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		sudoku(0, 0);
		
	}
	
	// 스도쿠 StringBuilder 값 대입 Method
	public static void sudoku(int row, int col) {
		 
		// 해당 행이 다 채워졌을 경우 다음 행의 첫 번째 열부터 시작
		if (col == 9) {
			sudoku(row + 1, 0);
			return;
		}
 
		// 행과 열이 모두 채워졌을 경우 출력 후 종료
		if (row == 9) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(sudoku[i][j]).append(' ');
				}
				sb.deleteCharAt(sb.length()-1);
				sb.append('\n');
			}
			
			sb.deleteCharAt(sb.length()-1);
			System.out.print(sb);
			System.exit(0);
		}
 
		// 만약 해당 위치의 값이 0 이라면 1부터 9까지 중 가능한 수 탐색
		if (sudoku[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				// i 값이 중복되지 않는지 검사
				if (checking(row, col, i)) {
					sudoku[row][col] = i;
					sudoku(row, col + 1);
				}
			}
			sudoku[row][col] = 0;
			return;
		}
 
		sudoku(row, col + 1);
 
	}
	
	// 스도쿠 유망성 검사
	public static boolean checking(int row, int col, int value) {
		 
		// 같은 행에 있는 원소들 중 겹치는 열 원소가 있는지 검사
		for (int i = 0; i < 9; i++) {
			if (sudoku[row][i] == value) {
				return false;
			}
		}
 
		// 같은 열에 있는 원소들 중 겹치는 행 원소가 있는지 검사
		for (int i = 0; i < 9; i++) {
			if (sudoku[i][col] == value) {
				return false;
			}
		}
 
		// 3*3 칸에 중복되는 원소가 있는지 검사
		int set_row = (row / 3) * 3; // value가 속한 3x3의 행의 첫 위치
		int set_col = (col / 3) * 3; // value가 속한 3x3의 열의 첫 위치
 
		for (int i = set_row; i < set_row + 3; i++) {
			for (int j = set_col; j < set_col + 3; j++) {
				if (sudoku[i][j] == value) {
					return false;
				}
			}
		}
 
		return true; // 중복되는 것이 없을 경우 true 반환
	}

	
}
