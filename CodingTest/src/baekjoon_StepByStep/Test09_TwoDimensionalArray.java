package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test16_TwoDimensionalArray {

	public static void main(String[] args) throws IOException {
		test03();
	}
	
	// 행렬 덧셈
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] temp = new int[N][M];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int k = 0; k < M; k++) {
					temp[j][k] += Integer.parseInt(st.nextToken());
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				sb.append(temp[i][j]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

	// 최댓값
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] array = new int[9][9];
		
		int max = 0;
		int maxX = 0;
		int maxY = 0;
		for(int x = 0; x < 9; x++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int y = 0; y < 9; y++) {
				array[x][y] = Integer.parseInt(st.nextToken());
				if(array[x][y] > max) {
					max = array[x][y];
					maxX = x;
					maxY = y;
				}
			}
		}
		
		System.out.println(max);
		System.out.println((maxX+1) + " " + (maxY+1));
	}
	
	// 색종이
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		int[][] board = new int[100][100];
		int N = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < N; t++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			for (int i = r; i < r+10; i++) {
				
				for (int j = c; j < c+10; j++) {
					
					if(i >= 100 || j >= 100)continue;
					if(board[i][j] != 0)continue;
					board[i][j] = 1;
					answer++;
					
				}
			}
		}
		
		System.out.println(answer);
	}
}
