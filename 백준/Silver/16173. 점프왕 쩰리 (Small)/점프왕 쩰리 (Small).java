import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static int arr[][];
	private static boolean visit[][];
	private static int N;
	private static int[] dx = {0, 1}, dy = {1, 0};

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visit = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < N; j++) arr[i][j] = Integer.parseInt(st.nextToken());
			
		}
		
		DFS2(0, 0);
		
		System.out.println("Hing");
	}

	public static void DFS2(int i, int j) {
		
		if(arr[i][j] == -1) {
			System.out.println("HaruHaru");
			System.exit(0);
		}
		
		for(int k = 0; k < 2; k++) {
			
			int x = i + dx[k] * arr[i][j];
			int y = j + dy[k] * arr[i][j];
			if(x >= N || y >= N || visit[x][y]) continue;
			
			visit[x][y] = true;
			DFS2(x, y);
		}
	}
}
