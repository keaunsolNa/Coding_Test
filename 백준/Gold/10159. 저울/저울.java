import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N + 1][N + 1];
		for(int i = 1; i < N + 1; i++) arr[i][i] = 1;
		
		for(int i = 0; i < M; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = 1;
			arr[y][x] = -1;
			
		}
		
		for(int a = 1; a < N + 1; a++) 
			for(int b = 1; b < N + 1; b++) 
				for(int c = 1; c < N + 1; c++) {
					
					if(arr[b][a] == 1 && arr[a][c] == 1) arr[b][c] = 1;
					if(arr[b][a] == -1 && arr[a][c] == -1 ) arr[b][c] = -1;
				}
			
		for(int i = 1; i < N + 1; i++) {
			
			int cnt = 0;
			for(int j = 1; j < N + 1; j++) if(arr[i][j] != 0) cnt++;
		
			sb.append((N - cnt) + "\n");
		}
		
		System.out.println(sb.toString());
   }
}