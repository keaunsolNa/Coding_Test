import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		boolean[] fence = new boolean[101];
		for(int i = A; i < B; i++) fence[i] = true;
		for(int i = C; i < D; i++) fence[i] = true;
		
		int ans = 0;
		for(int i = 0; i <= 100; i++) {
			if(fence[i]) ans++;
		}
		
		
		System.out.println(ans);
	}
}
