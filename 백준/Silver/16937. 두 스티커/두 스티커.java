import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static int MAX;
	private static int H, W, N;
	private static int[][] stickers;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		H = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(br.readLine());
	
		stickers = new int[N][3];

		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			stickers[i][0] = Integer.parseInt(st.nextToken());
			stickers[i][1] = Integer.parseInt(st.nextToken());
			stickers[i][2] = stickers[i][0] * stickers[i][1];
			
		}
		
		MAX = 0;
		calc();
		
		System.out.println(MAX);
		
	}
	
	private static void calc() {
		
		for(int i = 0; i < stickers.length; i++) {
			
			for(int j = i + 1; j < stickers.length; j++) {
				
				if(i == j) continue;
				if(possible(stickers[i], stickers[j])) MAX = Math.max(MAX, stickers[i][2] + stickers[j][2]);
			}
		}
	}
	
	private static boolean possible(int[] a, int[] b) {
		
		for(int i = 0; i < 2; i++) {
			
			for(int j = 0; j < 2; j++) {
				
				if((a[i] + b[j]) <= H && Math.max(a[(i+1)%2], b[(j+1)%2]) <= W) return true;
				if((a[i] + b[j]) <= W && Math.max(a[(i+1)%2], b[(j+1)%2]) <= H) return true;
			}
		}
		
		return false;
	}

}