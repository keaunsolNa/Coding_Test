import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[2][2];
		boolean chk = false;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				
				int temp = Integer.parseInt(st.nextToken());
				if(temp == 1 && !chk) {
					chk = true;
					map[0][0] = i;
					map[0][1] = j;
				}
				
				if(temp == 1 && chk) {
					map[1][0] = i;
					map[1][1] = j;
				}
			}
		}
		
		System.out.print(Math.abs(map[0][0] - map[1][0]) + Math.abs(map[0][1] - map[1][1]));
		
	}
}
