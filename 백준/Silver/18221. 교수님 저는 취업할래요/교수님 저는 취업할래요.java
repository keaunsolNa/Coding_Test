import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		int[][] map = new int[N][N];
		int pX = 0;
		int pY = 0;
		int tX = 0;
		int tY = 0;
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				int x = Integer.parseInt(st.nextToken());
				map[i][j] = x;
				
				if(x == 2) {
					tX = i;
					tY = j;
				}
				
				if(x == 5) {
					pX = i;
					pY = j;
				}
				
			}
			
		}
		
		boolean chk = true;
		if(Math.pow(Math.abs(pX - tX), 2) + Math.pow(Math.abs(pY - tY), 2) < 25) chk = false;
		
		int stu = 0;
		if(chk) {
			
			for(int i = Math.min(tX, pX); i <= Math.max(tX, pX); i++) {
				
				for(int j = Math.min(tY, pY); j <= Math.max(tY, pY); j++) {
					if(map[i][j] == 1) stu++;
				}
			}
				
		}
		
		if(stu < 3) chk = false;
		
		if(chk) System.out.println(1);
		else System.out.println(0);
	}
}
