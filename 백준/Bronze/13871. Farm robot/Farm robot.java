import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int point = 1;
		int ans = 0;
		if(S == 1) ans++;
		
		for(int i = 0; i < C; i++) {
			int move = Integer.parseInt(st.nextToken());
			
			if(move == 1) point++;
			else point--;
			
			if(point == 0) point = N;
			if(point == N + 1) point = 1;
			if(point == S) ans++;
			
		}
		
		System.out.print(ans);
		
	}
}
