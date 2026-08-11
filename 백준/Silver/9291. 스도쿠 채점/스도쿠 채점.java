import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 0; t < T; t++) {
			
			int[][] map = new int[9][9];
			boolean corectX = true;
			boolean[] corect = new boolean[9];
			String ans = "";
			
			for(int i = 0; i < 9; i++) {
				
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 9; j++) {
					int temp = Integer.parseInt(st.nextToken());
					map[i][j] = temp;
					corect[temp - 1] = true;
				}

				for (boolean b : corect) 
					if(!b) corectX = false;
				
				corect = new boolean[9];
			}
			
			boolean corectY = true;
			if(corectX) {
				
				corect = new boolean[9];
				for(int i = 0; i < 9; i++) {
					
					for(int j = 0; j < 9; j++) corect[map[j][i] - 1] = true;
					
					for (boolean b : corect) 
						if(!b) { corectY = false; break; }
					
					corect = new boolean[9];
				}
				
				if(corectY) {
					
					boolean corectZ = true;
					corect = new boolean[9];
					int sx = 0;
					int sy = 0;
					
					for(int z = 0; z < 3; z++) {
						
						for(int i = 0; i < 3; i++) {
							
							for(int x = sx; x < sx + 3; x++) {
								
								for(int y = sy; y < sy + 3; y++) 
									corect[map[x][y] - 1] = true;
							}
							
							for (boolean b : corect) 
								if(!b) { corectZ = false; break; }
							
							sx += 3;
							corect = new boolean[9];
						}
						
						sy += 3;
						sx = 0;
					}
					
					if(corectZ) ans = "CORRECT";
					else ans = "INCORRECT";
					
				} else ans = "INCORRECT";
				
				
			} else ans = "INCORRECT";
			
			sb.append("Case " + (t + 1) + ": " + ans + "\n");
			if(t < T - 1) br.readLine();
		}
		
		System.out.println(sb);
	}
}
