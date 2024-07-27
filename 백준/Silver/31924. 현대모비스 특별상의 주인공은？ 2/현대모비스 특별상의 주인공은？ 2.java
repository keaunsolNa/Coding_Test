import java.io.*;
import java.util.*;

public class Main {
	
	static int n, count = 0;
	static int[] rx = {1, 2, 3, 4};
	static int[] uy = {-1, -2, -3, -4};
	static int[] dy = {1, 2, 3, 4}; 
	static char[] mobis = {'O', 'B', 'I', 'S'};
	static char[] sibom = {'I', 'B', 'O', 'M'};
	static char[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine()); 
		
		String s;
		map = new char[n][n];
		
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			
			for (int j = 0; j < n; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 'M') {
					mobis(i, j);
				} else if (map[i][j] == 'S') {
					sibom(i, j);
				}
			}
		}
		
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void mobis(int y, int x) {
		int index = 0;
		int nowy = y;
		int nowx = x;
		int nexty, nextx;
		
		for (int i = 0; i < 4; i++) {
			nexty = nowy + uy[i];
			nextx = nowx + rx[i];
			
			if (check(nexty, nextx) && map[nexty][nextx] == mobis[index]) {
				index++;
				
				if (index == 4) {
					count++;
				}
			} else {
				break;
			}
		}
		
		index = 0;
		for (int i = 0; i < 4; i++) {
			nextx = nowx + rx[i];
			
			if (check(nowy, nextx) && map[nowy][nextx] == mobis[index]) {
				index++;
				
				if (index == 4) {
					count++;
				}
			} else {
				break;
			}
		}
		
		index = 0;
		for (int i = 0; i < 4; i++) {
			nexty = nowy + dy[i];
			nextx = nowx + rx[i];
			
			if (check(nexty, nextx) && map[nexty][nextx] == mobis[index]) {
				index++;
				
				if (index == 4) {
					count++;
				}
			} else {
				break;
			}
		}
		
		index = 0;
		for (int i = 0; i < 4; i++) {
			nexty = nowy + dy[i];
			
			if (check(nexty, nowx) && map[nexty][nowx] == mobis[index]) {
				index++;
				
				if (index == 4) {
					count++;
				}
			} else {
				break;
			}
		}
	}
	
	private static void sibom(int y, int x) {
		int index = 0;
		int nowy = y;
		int nowx = x;
		int nexty, nextx;
		
		for (int i = 0; i < 4; i++) {
			nexty = nowy + uy[i];
			nextx = nowx + rx[i];
			
			if (check(nexty, nextx) && map[nexty][nextx] == sibom[index]) {
				index++;
				
				if (index == 4) {
					count++;
				}
			} else {
				break;
			}
		}
		
		index = 0;
		for (int i = 0; i < 4; i++) {
			nextx = nowx + rx[i];
			
			if (check(nowy, nextx) && map[nowy][nextx] == sibom[index]) {
				index++;
				
				if (index == 4) {
					count++;
				}
			} else {
				break;
			}
		}
		
		index = 0;
		for (int i = 0; i < 4; i++) {
			nexty = nowy + dy[i];
			nextx = nowx + rx[i];
			
			if (check(nexty, nextx) && map[nexty][nextx] == sibom[index]) {
				index++;
				
				if (index == 4) {
					count++;
				}
			} else {
				break;
			}
		}
		
		index = 0;
		for (int i = 0; i < 4; i++) {
			nexty = nowy + dy[i];
			
			if (check(nexty, nowx) && map[nexty][nowx] == sibom[index]) {
				index++;
				
				if (index == 4) {
					count++;
				}
			} else {
				break;
			}
		}
	}
	
	private static boolean check(int y, int x) {
		return y >= 0 && x >= 0 && y < n && x < n; 
	}
}
