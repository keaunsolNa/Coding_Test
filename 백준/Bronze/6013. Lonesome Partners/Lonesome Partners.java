import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static int ans = (int)1e5;

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		int[][] map = new int[T][2];
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			map[i][0] = x;
			map[i][1] = y;
		}
		
		double max = Double.MIN_VALUE;
		int[] ans = new int[2];
		for(int i = 0; i < T; i++) {
			
			for(int j = i + 1; j < T; j++) {
				
				double dis = Math.pow(map[i][0] - map[j][0], 2) + Math.pow(map[i][1] - map[j][1], 2);
				
				if(max < dis) {
					max = dis;
					ans[0] = i + 1;
					ans[1] = j + 1;
				}
			}
		}
		
		System.out.println(ans[0] + " " + ans[1]);
		
	}
}
