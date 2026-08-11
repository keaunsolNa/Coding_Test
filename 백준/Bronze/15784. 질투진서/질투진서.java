import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken()) - 1;
		int b = Integer.parseInt(st.nextToken()) - 1;
		
		int[][] seat = new int[N][N];
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) seat[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int jinsea = seat[a][b];
		boolean isAngry = false;
		for(int i = 0; i < N; i++) {
			if(seat[a][i] > jinsea) isAngry = true;
			if(seat[i][b] > jinsea) isAngry = true;
		}
		
		if(isAngry) System.out.println("ANGRY");
		else System.out.println("HAPPY");
		
	}
}
