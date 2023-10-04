import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int[][] sudoku = new int[9][9];
    
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < 9; j++) {
				sudoku[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		sudoku(0, 0);
    }
    	
	public static void sudoku(int row, int col) {
		 
		if (col == 9) {
			sudoku(row + 1, 0);
			return;
		}
 
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
 
		if (sudoku[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (possibility(row, col, i)) {
					sudoku[row][col] = i;
					sudoku(row, col + 1);
				}
			}
			sudoku[row][col] = 0;
			return;
		}
 
		sudoku(row, col + 1);
 
	}
	
	
	public static boolean possibility(int row, int col, int value) {
		 
		for (int i = 0; i < 9; i++) {
            
			if (sudoku[row][i] == value) {
				return false;
			}
            
		}
 
		for (int i = 0; i < 9; i++) {
            
			if (sudoku[i][col] == value) {
				return false;
			}
            
		}
 
		int set_row = (row / 3) * 3; 
		int set_col = (col / 3) * 3;
 
		for (int i = set_row; i < set_row + 3; i++) {
            
			for (int j = set_col; j < set_col + 3; j++) {
                
				if (sudoku[i][j] == value) {
					return false;
				}
                
			}
		}
 
		return true;
	}
}