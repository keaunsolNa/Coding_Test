import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    
    private static int N;
	private static int[][] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];

		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] =  Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(divide(0, 0, N));
	}
	
	private static int divide(int row, int col, int size) {
	
		if(size < 2) return arr[row][col];
		
		int newSize = size / 2;
		int[] temp = new int[4];
		
		for(int i = 0; i < 4; i++) {

			int nr = row + (i % 2) * newSize;	// 0, 1, 0, 1
			int nc = col + (i / 2) * newSize;	// 0, 0, 1, 1
			
			temp[i] = divide(nr, nc, newSize);
		}
		
		Arrays.sort(temp);
		return temp[2];
		
	}
}
