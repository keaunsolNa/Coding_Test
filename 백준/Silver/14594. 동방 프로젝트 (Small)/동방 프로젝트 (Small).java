import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		boolean[] wall = new boolean[N - 1];
		int cnt = 0;

		for(int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			for(int j = start - 1; j < end - 1; j++) wall[j] = true;
			
		}
		
		for (boolean b : wall) if(!b) cnt++;
		
		
		System.out.println(cnt + 1);
		
	}
}
