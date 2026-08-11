import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			int R = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			if(R == 0 && C == 0) break;
			
			int[][]map = new int[R][C];
			
			for(int i = 0; i < R; i++) {
				
				input = br.readLine();
				for(int j = 0; j < C; j++) 
					map[i][j] = (input.charAt(j) == '*') ? -1 : 0;
			}
			
			for(int x = 0; x < R; x++) {
				
				for(int y = 0; y < C; y++) {
					
					if(map[x][y] == -1) continue;
					if(x - 1 >= 0 && map[x - 1][y] == -1) map[x][y]++;
					if(x - 1 >= 0 && y - 1 >= 0 && map[x - 1][y - 1] == -1) map[x][y]++;
					if(x - 1 >= 0 && y + 1 < C && map[x - 1][y + 1] == -1) map[x][y]++;
					if(y - 1 >= 0 && map[x][y - 1] == -1) map[x][y]++;
					if(y + 1 < C && map[x][y + 1] == -1) map[x][y]++;
					if(x + 1 < R && map[x + 1][y] == -1) map[x][y]++;
					if(x + 1 < R && y - 1 >= 0 && map[x + 1][y - 1] == -1) map[x][y]++;
					if(x + 1 < R && y + 1 < C && map[x + 1][y + 1] == -1) map[x][y]++;
				}
			}
			
			for(int x = 0; x < R; x++) {
				
				for(int y = 0; y < C; y++) {
					
					System.out.print(map[x][y] == -1 ? "*" : map[x][y]);
				}
				System.out.println();
			}
			
		}
		
	}

	public static void print(int x) {
		
		System.out.print(x / 12 + "'" + x % 12 + "\"");
	}
}
