import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static int max = Integer.MAX_VALUE >> 2;
    private static int N;

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N + 1][N + 1];
		
		for(int i = 1; i <= N; i++) {
			
			String input = br.readLine();
			for(int j = 1; j <= N; j++) 
				arr[i][j] = input.charAt(j - 1) == 'Y' ? 1 : max;
			
		}

		for(int k = 1; k <= N; k++) {
			
			for(int i = 1; i <= N; i++) {
				
				for(int j = 1; j <= N; j++) {
					
					if(i == j || j == k || i == k) continue;
					
					else if(arr[i][j] > arr[i][k] + arr[k][j])
						arr[i][j] = arr[i][k] + arr[k][j];
				}
			}
		}
		
		int ans = 0;
		for(int i = 1; i <= N; i++) {
			int temp = 0;
			
			for(int j = 1; j <= N; j++) {
				
				if(i == j) continue;
				
				else if(arr[i][j] <= 2) temp++;
			}
			
			ans = Math.max(ans, temp);
		}
		
		System.out.println(ans);
		
	}
}
